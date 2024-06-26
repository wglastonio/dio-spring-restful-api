# DIO Santander Bootcamp
RESTful API using spring boot.

## Classes Diagram

```mermaid
classDiagram
    class User {
        -clientName: string
        -account: Account
        -features: Feature[]
        -card: Card
        -news: News[]

        +deposit(amount: float): void
        +withdraw(amount: float): void
        +transfer(to: User, amount: float): void
    }

    class Account {
        -accountNumber: string
        -branch: string
        -accountBalance: float
        -accountLimit: float
    }

    class Feature {
        -icon: string
        -featureDescription: string
    }

    class Card {
        -cardNumber: string
        -cardLimit: float
    }

    class News {
        -icon: string
        -newsDescription: string
    }

    User "1" -- "1" Account
    User "1" -- "0..*" Feature
    User "1" -- "1" Card
    User "1" -- "0..*" News
```
