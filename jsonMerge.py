import json

json_files = ["city_news_articles.json", "global_news.json"]

python_objects = []

for json_file in json_files:
    with open(json_file, "r") as f:
        python_objects.append(json.load(f))

# Dump all the Python objects into a single JSON file.
with open("combined.json", "w") as f:
    json.dump(python_objects, f, indent=4)