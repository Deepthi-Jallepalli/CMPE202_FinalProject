# List of APIs 

  

## Authentication API

1. Signup - Register a new user with the specified details of the user 

- URL - /signup 
- HTTP Method: POST 
- Parameters 
    - Email 
    - Password 
    - FirstName 
    - LastName 
    - City 
    - State 

### Sample URL 
```swift
https://msoncloud.com/signup?email=test13@test13.com&first_name=test13&last_name=test13&city=test13city&state=test13state&password=test13](https://msoncloud.com/signup?email=test13@test13.com&first_name=test13&last_name=test13&city=test13city&state=test13state&password=test13) 
```

### Sample Response
```swift

{
    "cust_id": 16,
    "first_name": "test13",
    "last_name": "test13",
    "email": "test13@test13.com",
    "city": "test13city",
    "state": "test13state",
    "password": "test13"
}
``` 
  

2. Login - Login to the account of the user by validating the user details 

- URL - /login 
- HTTP Method: POST 
- Parameters 
    - Email 
    - Password 

### Sample URL 
```swift
https://msoncloud.com/login?email=test13@test13.com&password=test13
```
### Sample Response 
```swift
{
    "cust_id": 16,
    "first_name": "test13",
    "last_name": "test13",
    "email": "test13@test13.com",
    "city": "test13city",
    "state": "test13state",
    "password": "test13"
}
```

## Add Card API 

Add a new Card with Card details like Card ID and Card Code to the specified Customer. The Initial Balance of the card is assigned through this API.

  

- URL - /addcard 
- HTTP Method: POST 
- Parameters 
    - Customer ID 
    - Card ID 
    - Card Code 
    - Balance 

### Sample URL
```swift
https://msoncloud.com/addcard?cust_id=10&card_id=123458217&card_code=123&balance=50
```

### Sample Response 
```swift
{
    "cust_id": 10,
    "card_id": 123458217,
    "card_code": 123,
    "balance": 50,
    "_id": 19
}
```
## Payments API 

The Payments API is used to make a payment with the specified amount which will be deducted from the initial balance of the card when it was added to the user.

- URL - /makepayment 
- HTTP Method: POST 
- Parameters 
    - Customer ID 
    - Card ID 
    - Card Code 
    - Balance 

### Sample URL
```swift
https://msoncloud.com/makepayment?cust_id=10&card_id=123456783&card_code=123&balance=20
```
### Sample Response
```swift
{
    "cust_id": 10,
    "card_id": 123456783,
    "card_code": 123,
    "balance": 170,
    "_id": 0
}
```

## Manage Orders API 

The Manage orders API is used to list the history of transactions carried out by the user. It also lists the transactions of all cards added under the user’s account. The Response consists of the Transaction ID, Transaction time and the amount paid at the time of payment.

- URL - /history 
- HTTP Method: GET 
- Parameters 
    - Customer ID 
    - Card ID 
    - Card Code 
    - Balance 

### Sample URL 
```swift
https://msoncloud.com/history?cust_id=10
```
### Sample Response 
```swift
[
    {
        "TRANSACTION_ID": 7,
        "CUST_ID": 10,
        "CARD_ID": 123456783,
        "TRANSACTION_TIME": "2019-05-10T05:04:46.000+0000",
        "PAYMENT_AMOUNT": 20
    },
    {
        "TRANSACTION_ID": 8,
        "CUST_ID": 10,
        "CARD_ID": 123456783,
        "TRANSACTION_TIME": "2019-05-10T06:30:42.000+0000",
        "PAYMENT_AMOUNT": 20
    },
    {
        "TRANSACTION_ID": 9,
        "CUST_ID": 10,
        "CARD_ID": 123456783,
        "TRANSACTION_TIME": "2019-05-10T06:31:02.000+0000",
        "PAYMENT_AMOUNT": 20
    },
    {
        "TRANSACTION_ID": 10,
        "CUST_ID": 10,
        "CARD_ID": 189327583,
        "TRANSACTION_TIME": "2019-05-10T06:38:37.000+0000",
        "PAYMENT_AMOUNT": 25
    },
    {
        "TRANSACTION_ID": 11,
        "CUST_ID": 10,
        "CARD_ID": 123456783,
        "TRANSACTION_TIME": "2019-05-10T07:45:02.000+0000",
        "PAYMENT_AMOUNT": 20
    }
]
```

## Add Balance API 

The Add Balance API is used to add an additional amount (reloading) to the already added card.

- URL - /addbalance 
- HTTP Method: POST 
- Parameters 
    - Customer ID 
    - Card ID 
    - Card Code 
    - Balance 

### Sample URL
```swift
https://msoncloud.com/addbalance?cust_id=10&card_id=123456783&card_code=123&balance=50
```
### Sample Response
```swift
{
    "cust_id": 10,
    "card_id": 123456783,
    "card_code": 123,
    "balance": 220,
    "_id": 0
}
```
