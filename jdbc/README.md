# 关于JDBC的操作

JDBC (Java DB Connection)---Java数据库连接

JDBC是一种可用于执行SQL语句的JAVA API（ApplicationProgramming Interface应用程序设计接口）。它由一些Java语言编写的类和界面组成。

JDBC为数据库应用开发人员和数据库前台工具开发人员提供了一种标准的应用程序设计接口，使开发人员可以用纯JAVA语言编写完整的数据库应用程序。

JDBC代表JAVA数据库连接。它是一个软件层，允许开发者在JAVA中编写客户端/服务器应用。

一、ODBC到JDBC的发展历程

ODBC是OpenDatabaseConnectivity的英文简写。它是一种用来在相关或不相关的数据库管理系统（DBMS）中存取数据的，用C语言实现的，标准应用程序数据接口。通过ODBCAPI，应用程序可以存取保存在多种不同数据库管理系统（DBMS）中的数据，而不论每个DBMS使用了何种数据存储格式和编程接口。

1．ODBC的结构模型

ODBC的结构包括四个主要部分：应用程序接口、驱动器管理器、数据库驱动器和数据源。

应用程序接口：屏蔽不同的ODBC数据库驱动器之间函数调用的差别，为用户提供统一的SQL编程接口。

驱动器管理器：为应用程序装载数据库驱动器。

数据库驱动器：实现ODBC的函数调用，提供对特定数据源的SQL请求。如果需要，数据库驱动器将修改应用程序的请求，使得请求符合相关的DBMS所支持的文法。

数据源：由用户想要存取的数据以及与它相关的操作系统、DBMS和用于访问DBMS的网络平台组成。

虽然ODBC驱动器管理器的主要目的是加载数据库驱动器，以便ODBC函数调用，但是数据库驱动器本身也执行ODBC函数调用，并与数据库相互配合。因此当应用系统发出调用与数据源进行连接时，数据库驱动器能管理通信协议。当建立起与数据源的连接时，数据库驱动器便能处理应用系统向DBMS发出的请求，对分析或发自数据源的设计进行必要的翻译，并将结果返回给应用系统。

2．JDBC的诞生

自从Java语言于1995年5月正式公布以来，Java风靡全球。出现大量的用java语言编写的程序，其中也包括数据库应用程序。由于没有一个Java语言的API，编程人员不得不在Java程序中加入C语言的ODBC函数调用。这就使很多Java的优秀特性无法充分发挥，比如平台无关性、面向对象特性等。随着越来越多的编程人员对Java语言的日益喜爱，越来越多的公司在Java程序开发上投入的精力日益增加，对java语言接口的访问数据库的API的要求越来越强烈。也由于ODBC的有其不足之处，比如它并不容易使用，没有面向对象的特性等等，SUN公司决定开发一Java语言为接口的数据库应用程序开发接口。在JDK1．x版本中，JDBC只是一个可选部件，到了JDK1．1公布时，SQL类包（也就是JDBCAPI）就成为Java语言的标准部件。

二、JDBC技术概述

JDBC是一种可用于执行SQL语句的JavaAPI（ApplicationProgrammingInterface，应用程序设计接口）。

通过使用JDBC，开发人员可以很方便地将SQL语句传送给几乎任何一种数据库。也就是说，开发人员可以不必写一个程序访问Sybase，写另一个程序访问Oracle，再写一个程序访问Microsoft的SQLServer。用JDBC写的程序能够自动地将SQL语句传送给相应的数据库管理系统（DBMS）。不但如此，使用Java编写的应用程序可以在任何支持Java的平台上运行，不必在不同的平台上编写不同的应用。Java和JDBC的结合可以让开发人员在开发数据库应用时真正实现“WriteOnce，RunEverywhere！”

Java具有健壮、安全、易用等特性，而且支持自动网上下载，本质上是一种很好的数据库应用的编程语言。它所需要的是Java应用如何同各种各样的数据库连接，JDBC正是实现这种连接的关键。

JDBC扩展了Java的能力，如使用Java和JDBCAPI就可以公布一个Web页，页中带有能访问远端数据库的Ap plet。或者企业可以通过JDBC让全部的职工（他们可以使用不同的操作系统，如Windwos，Machintosh和UNIX）在In tranet上连接到几个全球数据库上，而这几个全球数据库可以是不相同的。随着越来越多的程序开发人员使用Java语言，对Java访问数据库易操作性的需求越来越强烈。

JDBC API定义了一组用于与数据库通信的接口和类。这些接口和类位于java.sql包中。

JDBC是用来（让我们的程序）通过网络来操作数据库的，作用很重要；JDBC技术也是Java核心技术之一。凡是需要用网络操作数据库的程序，JDBC编程有问题，一切都是白搭。

三、JDBC技术及使用详解



从结构图中可以看出，通过JDBC API 让我们的Java应用程序可以利用JDBCDriver Manager[JDBC驱动管理]，连接到JDBC驱动；体现在我们的工程中也就是要导入驱动jar包。

      何谓驱动？

      不同的数据库厂商或者同一厂商的不同数据库版本都会提供不同的驱动，任何应用程序都是通过这个驱动来操作特定厂商、特定版本的数据库的。

      使用JDBC的第一步就是要注册（加载）这个驱动。 

JDBC驱动程序的分类

第一类JDBC驱动程序是JDBC-ODBC桥再加上一个ODBC驱动程序。

这类驱动一般不用现在的编程应用中。



第二类JDBC驱动程序是部分JAVAAPI代码的驱动程序，用于把JDBC调用转换成主流数据库API的本机调用。



第三类JDBC驱动程序是面向数据库中间件的纯JAVA驱动程序，JDBC调用被转换成一种中间件厂商的协议，中间件再把这些调用转换到数据库API。



第四类JDBC驱动程序是直接面向数据库的纯JAVA驱动程序。



是使用JDBC驱动程序访问数据库的首选方式

通过JDBC操作数据库——步骤：

第1步：注册驱动 (只做一次)

第2步：建立连接(Connection)

第3步：创建执行SQL的语句(Statement)

第4步：执行语句

第5步：处理执行结果(ResultSet)

第6步：释放资源



使用JDBC第一步：加载驱动

注册驱动有三种方式：

1.      Class.forName(“com.mysql.jdbc.Driver”);

         推荐这种方式，不会对具体的驱动类产生依赖

2. DriverManager.registerDriver(com.mysql.jdbc.Driver);

         会对具体的驱动类产生依赖

3. System.setProperty(“jdbc.drivers”, “driver1:driver2”);

         虽然不会对具体的驱动类产生依赖；但注册不太方便，所以很少使用

使用JDBC第二步：建立连接

通过Connection建立连接，Connection是一个接口类，其功能是与数据库进行连接（会话）。

建立Connection接口类对象：

Connection conn =DriverManager.getConnection(url, user, password);

其中URL的格式要求为：

JDBC:子协议:子名称//主机名:端口/数据库名？属性名=属性值&…

如："jdbc:mysql://localhost:3306/test“

user即为登录数据库的用户名，如root

password即为登录数据库的密码，为空就填””

使用JDBC第三步：创建执行对象

执行对象Statement负责执行SQL语句，由Connection对象产生。

Statement接口类还派生出两个接口类PreparedStatement和CallableStatement，这两个接口类对象为我们提供了更加强大的数据访问功能。

创建Statement的语法为：

Statement st = conn.createStatement();

使用JDBC第四步：执行SQL语句

执行对象Statement提供两个常用的方法来执行SQL语句。

executeQuery(Stringsql),该方法用于执行实现查询功能的sql语句，返回类型为ResultSet（结果集）。

如：ResultSet  rs =st.executeQuery(sql);

executeUpdate(Stringsql),该方法用于执行实现增、删、改功能的sql语句，返回类型为int，即受影响的行数。

如：int flag = st.executeUpdate(sql);

使用JDBC第五步：处理执行结果

ResultSet对象

ResultSet对象负责保存Statement执行后所产生的查询结果。

结果集ResultSet是通过游标来操作的。

游标就是一个可控制的、可以指向任意一条记录的指针。有了这个指针我们就能轻易地指出我们要对结果集中的哪一条记录进行修改、删除，或者要在哪一条记录之前插入数据。一个结果集对象中只包含一个游标。

使用JDBC 第六步——释放资源

Connection对象的close方法用于关闭连接，并释放和连接相关的资源。



使用JDBC——模板







一些重要的接口----------------------------------------------------------------------------------------------------

PreperedStatement接口

PreperedStatement从Statement扩展而来。

需要多次执行SQL语句，可以使用PreparedStatement。

PreparedStatement可以对SQL语句进行预编译

并且可以存储在PreparedStatement对象中，当多次执行SQL语句时可以提高效率。

作为Statement的子类，PreparedStatement继承了Statement的所有函数。

 

创建PreperedStatement

PreparedStatementstr=con.prepareStatement("update user set id=? where username=?”);//此处?为通配符

其他的CRUD方法和Statement基本一致。

 

CallableStatement接口

CallableStatement类继承了PreparedStatement类，他主要用于执行SQL存储过程。

在JDBC中执行SQL存储过程需要转义。

JDBC API提供了一个SQL存储过程的转义语法：

{call<procedure-name>[<arg1>,<arg2>, ...]}

procedure-name：是所要执行的SQL存储过程的名字

[<arg1>,<arg2>, ...]：是相对应的SQL存储过程所需要的参数

 

ResultSetMeta接口

前面使用ResultSet接口类的对象来获取了查询结果集中的数据。

但ResultSet功能有限，如果我们想要得到诸如查询结果集中有多少列、列名称分别是什么就必须使用ResultSetMeta接口了。

ResultSetMeta是ResultSet的元数据。

元数据就是数据的数据， “有关数据的数据”或者“描述数据的数据”。

ResultSetMeta的使用

获得元数据对象

ResultSetMetaData rsmd=rst.getMetaData();

返回所有字段的数目

public int getColumCount() throwsSQLException

根据字段的索引值取得字段的名称

public String getColumName (int colum)throws SQLException

根据字段的索引值取得字段的类型

public String getColumType (int colum)throws SQLException

 

PreperedStatement接口和Statement的区别

(1) 使用Statement发送和执行sql语句

Statement stmt = con.creatStatement();//加载时，无参数，不编译sql语句

String sql = "selete * from emp";

ResultSet rs = stmt.executeQuery(sql);//执行时编译sql语句，返回查询结果集

(2) 使用PreparStatement发送和执行sql语句

String sql = "selete * from emp";

PreparStatement ps=con.prepareStatement(sql);//加载时就编译sql语句

ResultSet rs = ps.executeQuery();//此处执行时，不需要传参

还有就是

Statement stmt；支持可以通过字符串拼接(来传递参数)，如StringdeleteStu = "delete from student where id="+id;但容易ＳＱＬ注入

PreparedStatement   ps; 不支持字符串拼接，提供？通配符传递参数，更安全；如String deleteStu = "delete from student where id=?";

ps.setInt(1, id);  //设置第一个？通配值为id

 

JDBC事务

      何谓事务？

      所谓事务是指一组逻辑操作单元，使数据从一种状态变换到另一种状态。

      事务的ACID属性：

1.       原子性（Atomicity）：指事务是一个不可分割的工作单位，事务中的操作要么都发生，要么都不发生。

2.       一致性（Consistency）事务必须使数据库从一个一致性状态变换到另外一个一致性状态。

3.       隔离性（Isolation）事务的隔离性是指一个事务的执行不能被其他事务干扰。

4.       持久性（Durability）持久性是指一个事务一旦被提交，它对数据库中数据的改变就是永久性的，接下来的其他操作和数据库故障不应该对其有任何影响。

      JDBC中使用COMMIT 和 ROLLBACK语句来实现事务。

      COMMIT用于提交事务，ROLLBACK用于数据库回滚。

      通过这两个语句可以确保数据完整性；数据改变被提交之前预览；将逻辑上相关的操作分组。

      RollBack语句数据改变被取消使之再一次事务中的修改前的数据状态可以被恢复。

      为了让多个 SQL 语句作为一个事务执行，基本步骤为：

      先调用 Connection 对象的 setAutoCommit(false); 以取消自动提交事务。

      然后在所有的 SQL 语句都成功执行后，调用 commit();

      如果在出现异常时，可以调用 rollback();使方法回滚事务。

 

JTA事务

      在实际应用中经常会涉及到多个数据源的不同的连接，并且数据的操作要处于一个事务之中。

      如去银行进行转账，转账的两个账户是不同的银行，当然数据的操作就跨数据库了，或者叫处于不同的数据源之中。

      跨越多个数据源的事务，就要使用JTA容器实现事务。

      在分布式的情况下的JTA容指的是Web容器，大家非常熟悉的Tomcat不能实现JTA的操作。

      目前支持JTA的容器有非常著名的BEA公司的 Weblogic，IBM公司的WebSphere等企业级的Web应用服务器。

JTA分成两阶段提交

      第一步，通过JNDI在分布式的环境中查找相关资源。

                   javax.transaction.UserTransactiontx =                                        (UserTransaction)ctx.lookup(“jndiName");

                   tx.begin()

      第二步，提交

                   tx.commit();

