import requests
import pandas as pd
import json
import time


df = pd.read_excel(file_path, usecols=['city'])

cities = df['city'].tolist()[:80]  # Select only the first 80 cities

print(cities)
all_articles = []


# Function to get local news for a city
def get_local_news(city, api_key, page_size=10):
    url = (f"https://newsapi.org/v2/everything?q={city}&pageSize={page_size}&apiKey={api_key}")
    response = requests.get(url)
    return response.json()


for city in cities:
    try:
        city_articles = []

        while len(city_articles) < 10:
            news_data = get_local_news(city, api_key)
            if 'articles' in news_data:
                city_articles.extend(news_data['articles'])
            else:
                break  # Stop if no more articles are found

        all_articles.extend(city_articles[:10])

        # Print progress
        print(f"Scraped {len(city_articles[:10])} articles for {city}")

        time.sleep(1)

    except Exception as e:
        print(f"Error fetching news for {city}: {e}")

with open("city_news_articles.json", "w") as outfile:
    json.dump(all_articles, outfile)

print(f"Total articles scraped: {len(all_articles)}")
