fruit_shop = {
    "apple": 180,
    "banana": 50,
    "orange": 90,
    "peaches": 60,
    "guava": 80
}

key_to_check = input("Which fruit would you like?: ").lower()

if(key_to_check in fruit_shop):
    print(key_to_check + " costs " + str(fruit_shop[key_to_check]) + " rupees ")
else:
    print("Fruit not available")