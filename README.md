# 🍕 Pizza Ordering System in Java with OOP and Price Calculation


## 📚 Overview

This Java project implements a **Pizza Order Management System** using object-oriented programming (OOP) principles. The system handles different types of orders including:

- 🛵 **Delivery**
- 🪑 **Seated (Dine-In)**
- 🥡 **To-Go**

Each order type extends a base `PizzaOrder` class and overrides price calculations accordingly.

---

## 🧰 Features

- 🔄 Inheritance-based order types
- 🧮 Calculates total order prices for individual and grouped orders
- 📊 Sorts all orders by price using `Comparable`
- 🧾 Displays order details and total sum
- ✅ Uses `ArrayList` for dynamic order management
- 🧠 Polymorphic method overriding (`calculateOrderPrice`, `toString`, etc.)

---

## 🧱 Project Structure

. ├── Driver.java # Main class to execute and test orders ├── PizzaOrder.java # Base class with shared attributes/methods ├── Delivery.java # Subclass for delivery orders ├── Seated.java # Subclass for dine-in orders ├── ToGo.java # Subclass for to-go orders (assumed part of project) └── README.md # Project documentation


📌 Example Output

Ahmad 180.0
Suha 60.0
Ribhi 120.0
Rana 18.0
Jamal 160.0

Total sum of Order Prices = 538.0

pizzaOrder{
customerName ='Suha'
Date Ordered =Wed Mar 27 17:45:32 PST 2025
pizza Size =medium
Number of Topping =2
Topping Price =5.0
Trip Rate20.0
zone=2
order price:60

🔍 Class Summary
Class	Description
PizzaOrder	Base class with shared logic
Delivery	Adds trip rate and zone to order total
Seated	Adds service charge per person
ToGo	Represents a basic pick-up order
Driver	Runs the program and prints results


🔧 To Do
 Add GUI support (JavaFX or Swing)

 Allow input via console or file

 Export order reports as CSV

