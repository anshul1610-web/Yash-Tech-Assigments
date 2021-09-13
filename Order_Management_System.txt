ORDER MANAGEMENT SYSTEM 

 Defineds type of ENUMS:- 

 ==UserState
     NEW
     Alredy Register
     

 == OrderStatus
    - CREATE
    - SHIPPED
    - DELIVERED
    - PAID

 == PaymentType
    - COD
    - UPI
    - Wallet
   

 == DeliveryMode
    -STANDARD
    -Regular

INTERFACES:-

 == UserDataDAO
    +getUserData()
    +updateUserData()
    +addUserData()
    +deleteUserData()
    +modifyUserState(UserState state)

 == InventoryDataDAO()
    +getItems()
    +updateItems()
    +addItems()
    +deleteItems()

ABSTRACT CLASSES:- 

 == UserServices 
    +abstract updateProfile()
    +abstract updateAccessRights()
    +abstract updateShippingDetails()
    +abstract updatePaymentMode()
    +abstract login()
    +abstract signUp()

CLASSES:- 

 == User extends UserServices implements UserDataDAO
    -userId : String
    -userName : String
    -password: String
    -contactNo : long
    -userState : UserState

    +updateProfile()
    +updateAccessRights()
    +updateShippingDetails()
    +updatePaymentMode() 
    +login()
    +signUp()
    +getUserData()
    +updateUserData()
    +addUserData()
    +deleteUserData()
    +modifyUserState(UserState state)

 == Customer extends User
    -deliveryAddress : String
    -paymentMode : PaymentType
    
    +updateProfile()
    +updateShippingDetails(String deliveryAddress)
    +updatePaymentMode(PaymentType paymentMode)
    +login()
    +signUp()

 == Admin extends User
    +updateAccessRights()
    +updateProfile()
    +updateUserData()
    +modifyUserState(UserState state)
    +deleteUserData()
    +addUserData(Customer customer)
    +getUserData()

 == Payment
    -id : String
    -paid : Date
    -paymentMode : PaymentType

    +getId()
    +getDate()
    +getPaymentMode()

 == Order
    -orderNumber : long
    -orderDate : Date
    -shippedDate : Date
    -status : OrderStatus
    -quantity : int
    -price : double

    +getOrderNumber()
    +getOrderDate()
    +getShippedDate()
    +setShippedDate(Date shippedDate)
    +getOrderStatus()
    +setOrderStatus(OrderStatus status);
    +getQuantity()
    +getPrice()

 == Delivery extends Order 
    -deliveryType : DeliveryMode
    
    +getDeliverytype()
    +setDeliverytype(DeliveryMode deliveryType)
    +cancelDelivery()
    +setOrderStatus(OrderStatus status)

 == Product implements InventoryDataDAO
    -productId : String
    -productName : String
    -supplier : String
    -availableQty : int
    -costPrice : double
    -sellingPrice : double

    +getProductId()
    +getProductName()
    +getSupplier()
    +getAvailableQty()
    +getCostPrice()
    +getSellingPrice()
    +setSellingPrice(double price)
    +getItems()
    +updateItems()
    +addItems()
    +deleteItems()