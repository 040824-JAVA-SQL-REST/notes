# Back End Docs

## Controller / Service / DAO Layer

### Analogy

Think of a web application as a restaurant. The parts of a web application: Backend Screens, Services, and DAOs (Data Access Objects), can be compared to the menu, kitchen, and pantry in a restaurant.

1. **Backend Screens** are like the menu. They show you the choices but don't cook the food. They are your way to make choices, like a waiter showing you the menu.
2. **Services** are the kitchen staff and chefs. They get your order from the waiter and know how to cook your meal. They follow recipes (business rules) to prepare your food. They ask the pantry (DAOs) for the ingredients they need.
3. **DAOs (Data Access Objects)** are the pantry. They store all the ingredients. When the kitchen staff needs something, the pantry provides it. DAOs don't decide what to cook or how to cook it; they just give the ingredients. In web applications, DAOs access and change the database data. They don't know the business rules; they just get or store data as needed.

So, in this analogy:

- The **Backend Screens** are the menu, your way to make choices.
- The **Services** are the kitchen, where your choices are made into a meal aka waitresses, chefs, etc.
- The **DAOs** are the pantry, handling the raw ingredients (data), getting and storing them as needed.

### Important Note!

In summary, screens will always rely on services, and services will always rely on Data Access Objects (DAOs). Therefore, the flow is consistently from screen → service -> DAO.

## Dependency Injection

```java
public class Example {
	// Use 'final' to make an object immutable, preventing any changes to it.
	// Avoid using 'final' if you want the object to be mutable.
	private final Scanner scan;

	public Example (Scanner scan) {
		this.scan = scan;
	}
}
```

Insert the dependent object into the class.

```java
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	// Anonymous function
	new Example(scan);

	scan.close();
}
```

## Router Service

Use a router service to link all the screens. This service will supply the required dependencies for these screens. Given that all the screens are children of BaseScreen, we can create a method that returns the parent screen. The screens, being siblings, have a relationship to each other. Essentially, our router service will act as a central hub for all screens.

```java
public class RouterService {
    // Dependencies

    public BaseScreen navigate(String path) {
        switch (path) {
            case "/start":
                return new StartScreen(...);

            // Add more screens below...

            default:
                throw new IllegalArgumentException("Invalid path" + path);
        }
    }
}
```

## Services

The service will serve as the intermediary between our user-related screens and the User DAO. It will handle any logic required by the user screen, such as business logic and validation logic.

```java
public class UserService {
	// Inject UserDao...

	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	public boolean isValidUsername(String username) {
		// logic...
	}

	// Other business or validation logic...
}
```

## Implement Abstract Class For Consistency

Given the variety of screens such as login, register, start, etc., it is crucial to maintain consistency between them. This can be achieved using abstract classes and methods. Additionally, we can propagate reusable methods to the child classes, preventing the need for duplicate code. These methods include body definitions.

Example of Parent Screen

```java
public abstract class BaseScreen {
		// A method that all child screens must override
    public abstract void startInterface();

    protected void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    protected void pause(Scanner scan) {
        System.out.print("\nPress enter to continue...");
        scan.nextLine();
    }
}
```

Example of a Child Screen

```java
public class StartScreen extends BaseScreen {

	@Override
	public void startInterface() {
		// Implement logic...
	}
}
```
