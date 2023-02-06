import gspread
import pandas as pd
from oauth2client.service_account import ServiceAccountCredentials




# defining the scope of the application
scope =['https://spreadsheets.google.com/feeds','https://www.googleapis.com/auth/drive']

#credentials to the account
cred = ServiceAccountCredentials.from_json_keyfile_name('{hidden}}', scope)

# authorize the clientsheet
client = gspread.authorize(cred)


# get the sample of the Spreadsheet
sheet = client.open('example_attendance')

# get the first sheet of the Spreadsheet
sheet_instance = sheet.get_worksheet(0)


# get all the records of the data
df = pd.DataFrame(sheet_instance.get_all_records())

# update the data
sheet_instance.update_cell(1,12, value = '')

web_hook_url = '{hidden}'

import schedule
import time
import requests
import json

def check_attendance():
    # Calculate the total attendance
    attendance_perc = df.iloc[:,2:8].sum(axis=1).sum()/(df.iloc[:,2:8].count().sum())

    if attendance_perc < 0.8:
        # Send the notification
        slack_msg = {'text': 'Desired attendance not occured' }
        requests.post(web_hook_url,data=json.dumps(slack_msg))

schedule.every(1).minutes.do(check_attendance)

while True:
    schedule.run_pending()
    time.sleep(1)