# Detailed P0 Project: eCommerce Backend API with Javalin

## Introduction

### Objective

For this foundational project, you will design and implement a comprehensive backend API for an eCommerce platform utilizing the Javalin framework. The primary aim is to develop a RESTful API that effectively handles different user roles and functionalities. Key areas of focus include user authentication, product management, and order processing.

### Responsibilities

- **API Design:** Construct intuitive and robust API endpoints that align with the needs outlined in the user stories.
- **Data Modeling:** Develop clear and efficient data models that facilitate seamless data interactions and management.
- **Business Logic:** Implement logical processes that underpin the core functionalities of the eCommerce platform.
- **Database Integration:** Integrate and manage a relational database, preferably PostgreSQL, to store and retrieve application data.
- **Theme Selection:**
  Select a thematic focus for your project, such as a bookstore, grocery store, or clothing outlet. Ensure that the chosen theme is suitable for a general audience and reflects the diverse capabilities of an eCommerce platform.

## Project Management Guidelines:

1. Transferring User Stories to GitHub Issues:
   Please ensure all user stories listed below are individually copied to GitHub Issues. This will serve as the primary mechanism for tracking progress and managing tasks throughout the project life cycle.

2. Task Breakdown:
   Feel free to create additional issues as needed to further delineate tasks into manageable components. This approach will aid in clearer task allocation and more precise progress tracking.

3. Implementing Agile Best Practices:
   Adopt agile methodologies for project management, including:

Ticket Pointing: Estimate the effort required for each task using a point system. This facilitates better sprint planning and resource allocation.

## User Stories

### Admin Users

#### US-001: Product Management

- **As an** admin,
- **I want to** add, update, and delete products,
- **So that** I can manage the product catalog efficiently.
- **Acceptance Criteria**:
  - Admins must be authenticated to perform any product management actions.
  - Product updates can modify name, description, price, and category.
  - Products can be deleted, and related data must be handled according to deletion policies (e.g., soft delete).

#### US-002: Order Overview

- **As an** admin,
- **I want to** view all orders,
- **Acceptance Criteria**:
  - Only authenticated admins can view order details.
  - Orders should be displayed with all relevant information: customer name, total price, items purchased, and order status.
  - Provide filtering options like order status (e.g., pending, shipped, delivered) and date range.

### Registered Users

#### US-004: Account Creation and Login

- **As a** visitor,
- **I want to** create an account and log in,
- **So that** I can access personalized features and shopping history.
- **Acceptance Criteria**:
  - Account creation requires: email, password, first name, and last name.
  - Fields must be validated for correctness and uniqueness.
  - Passwords must be securely hashed and stored.
  - Login requires email and password.
  - New users must have a default role (e.g., `USER`).

#### US-005: View Product Catalog

- **As a** registered user,
- **I want to** browse the product catalog,
- **So that** I can find products to purchase.
- **Acceptance Criteria**:
  - Products are listed with details: name, price, description, and category.
  - Users must be authenticated to view product details or make purchases.

#### US-006: Add to Cart and Checkout

- **As a** registered user,
- **I want to** add products to my cart and checkout,
- **So that** I can purchase my desired items.
- **Acceptance Criteria**:
  - Users must be logged in to add items to the cart and checkout.
  - The cart should display item details, quantity, and total price.
  - Checkout will clear the cart and create an order with the selected items.

#### US-007: Order History and Status

- **As a** registered user,
- **I want to** view my order history and track order status,
- **So that** I can stay informed about my purchases.
- **Acceptance Criteria**:
  - Order history is accessible only to logged-in users and includes details of all past orders.
  - Each order detail includes product names, quantities, total cost, order date.

### General API Functionalities

## Conclusion

These detailed user stories aim to guide the development of a secure, efficient, and user-friendly eCommerce backend API using Javalin. By fulfilling these requirements, the platform will offer a comprehensive shopping experience from product discovery to purchase and order tracking.
