# 关于JDBC的操作

JDBC是由java编程语言编写的类及接口组成，同时它为程序开发人员提供了一组用于实现对数据库访问的JDBC API,并支持SQL语言。利用JDBC可以将JAVA代码连接到oracle、DB2、SQLServer、MYSQL等数据库，从而实现对数据库中的数据操作的目的。

一、JDBC简介
JDBC全称为：Java Data Base Connectivity (java数据库连接），可以为多种数据库提供填统一的访问。JDBC是sun开发的一套数据库访问编程接口，是一种SQL级的API。它是由java语言编写完成，所以具有很好的跨平台特性，使用JDBC编写的数据库应用程序可以在任何支持java的平台上运行，而不必在不同的平台上编写不同的应用程序。

JDBC的主要功能如下：
（1）建立与数据库或者其他数据源的链接

（2）向数据库发送SQL命令

（3）处理数据库的返回结果

二、JDBC中常用类和接口
连接到数据库（Connection）、建立操作指令（Statement）、执行查询指令（executeQuery）、获得查询结果（ResultSet）等。

1、驱动程序管理类（DriverManager）
DriverManager类是JDBC的管理类，作用于用户和驱动程序之间。它跟踪在可用的驱动程序，并在数据库和相应驱动程序之间建立连接。另外，DriverManager类也处理诸如驱动程序登陆时间限制及登录和跟踪消息的显示事务。对于简单的应用程序，一般程序员需要在此类中直接使用唯一的方法时DriverManager.getConnection()。该方法将建立与数据库的链接。JDBC允许用户调用DriverManager的方法getDriver()、getDrivers()和registerDriver()及Driver的方法connect().

2、声明类（Statement）
Statement对象用于将SQL语句发送到数据库中。实际上有三种Statement对象，它们都作为在给定链接上执行SQL语句的包容器：Statement、PreparedStatement（它从Statement继承而来）和CallableStatement（它从PreparedStatement继承而来）。它们都专用于发送特定类型的SQL语句：

（1）Statement对象用于执行不带参数的简单的SQL语句；Statement接口提供了执行语句和获取结果的基本方法。

（2）PerparedStatement对象用于执行带或不带IN参数的预编译SQL语句；PeraredStatement接口添加处理IN参数的方法；

（3）CallableStatement对象用于执行对数据库已存储过程的调用；CallableStatement添加处理OUT参数的方法。

Statement提供了许多方法，最常用的方法如下：
（1）execute()方法：运行语句，返回是否有结果集。

（2）executeQuery()方法：运行查询语句，返回ReaultSet对象。

（3）executeUpdata()方法：运行更新操作，返回更新的行数。

（4）addBatch()方法：增加批处理语句。

（5）executeBatch()方法：执行批处理语句。

（6）clearBatch()方法：清除批处理语句。

3、数据库连接类 （Connection）
Connection对象代表与数据库的链接。连接过程包括所执行的SQL语句和在该连接上所返回的结果。一个应用程序可与单个数据库有一个或多个连接，或者可与很多数据库有连接。打开连接与数据库建立连接的标准方法是调用DriverManager.getConnection()方法。

String url="jdbc:mysql://127.0.0.1:3306/imooc";

String user="root";

String password="tiger";

DriverManager.getConnection(url,user,password);

4、结果集合类 （ResultSet）
ResultSet包含符合SQL语句中条件的所有行记录，并且它通过一套get方法（这些get方法可以访问当前行中的不同列）提供了对这些行中数据的访问。ResultSet.next()方法用于移动到ResultSet中的下一行，使下一行成为当前行。

5、JDBC编程步骤

（1）加载驱动程序：Class.forName(driverClass)

加载mysql驱动：Class.forName("com.mysql.jdbc.Driver");

加载oracle驱动：Class.forName("oracle.jdbc.driver.OracleDriver");

（2）获得数据库连接

DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/imooc",user,password);

DriverManager.gerConnection(URL,user,password);

（3）创建Statement对象：conn.createStatement();

（4）向数据库发送SQL命令

（5）处理数据库的返回结果(ResultSet类)