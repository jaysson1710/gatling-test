import requests
import json
import pandas as pd

url = "https://httpbin.org/post"

headers = {"Content-Type": "application/json; charset=utf-8"}

data = {
	"id": 1001,
	"name": "geek",
	"passion": "coding",
}

response = requests.post(url, headers=headers, json= json.dumps(data))

print("Status Code", response.status_code)
print("JSON Response ", response.json())

dato1 = response.json()
reg = json.loads(dato1["data"])
print ("datos *****************")
df = pd.json_normalize(dato1)
print(df)