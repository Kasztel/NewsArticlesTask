import requests
import json
import pandas as pd


all_articles = []

def get_global_news(api_key):
    url = f"https://newsapi.org/v2/top-headlines?country=us&pageSize=100&apiKey={api_key}"

    response = requests.get(url)
    return response.json()


news_global_data = get_global_news(api_key)
all_articles.extend(news_global_data['articles'])


print(f"Total articles scraped: {len(all_articles)}")

with open("global_news.json", "w") as outfile:
    json.dump(all_articles, outfile)
