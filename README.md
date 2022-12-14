# 馃捇 Portfolio Web Full Stack
### Proyecto Integrador - #YoProgramo (AP)
------------
**NOTA**: En este repositorio se encuentra todo lo relacionado al Backend del proyecto, para dirigirse al repositorio del Frontend hacer [click aqu铆](https://github.com/LuMarka/Portfolio-Frontend "click aqu铆")

### 馃摑 Descripci贸n
------------
-  Este **portfolio** fu茅 realizado como** proyecto final integrador** a presentar en el curso **#YoProgramo** de **Argentina Programa.**

- Se trata de una **API REST** realizada utilizando [Maven](https://maven.apache.org/) v 4.0.0, que es una herramienta de software para la gesti贸n y construcci贸n de proyectos [Java](https://www.java.com/es/),  el Framework [Spring Boot](https://start.spring.io/) que utiliza el patr贸n MVC (Modelo Vista Controlador) para la l贸gica y [MySQL](https://dev.mysql.com/downloads/workbench/) para persistencia de datos.  
1. Maven utiliza  archivo POM.xml (Proyect Object Model) para dentro de 茅l especificar las diferentes dependencias o librer铆as que ser谩n necesarias incluir en el proyecto que se est茅 desarrollando. En este caso algunas de estas dependencias utilizadas son:
		Spring Boot Dev Tools
		Spring Web
		Spring Data JPA
		MySQL Driver
		Validation
		Lombok
		Json Web Token
1. Proyecto desarrollado en [Java](https://www.java.com/es/) en su versi贸n 18.

1. Para este tipo de aplicaciones, Spring Boot posee un modelo de Arquitectura Multicapa: Controller, Repository o DAO, Model o Entity, DTO y Service.

-  La capa correspondiente al backend del presente proyecto integrador fue subido a [HEROKU](https://www.heroku.com/) y se utiliz贸 el servicio de nube [Clever Cloud](https://www.clever-cloud.com/) (para la Base de Datos MYSQL)

-En el presente repositorio se incluye, como un archivo en formato .pdf, el Diagrama Entidad - Relaci贸n (DER) utilizado en la Base de Datos Relacional y que posteriormente se traduce en las Entidades del Backend. Debajo se adjunta una previsualizaci贸n del mismo:
[![DER](https://i.ibb.co/0FKVyVh/DER.png "DER")](https://i.ibb.co/0FKVyVh/DER.png "DER")

### 鈱煐? Instalaci贸n

------------
Para ejecutar la aplicaci贸n en un entorno local se deben realizar los siguientes pasos:
1. Clonar el repositorio desde GitHub mediante descarga del archivo .zip, GitHub desktop o utilizando Git.
		git clone https://github.com/LuMarka/Portfolio-Backend.git

 2.Instalar las dependencias de Maven utilizando nuestro IDE preferido o a trav茅s del comando:
		mvn install
3.Crear y configurar el archivo application.properties en src/main/resources/

		spring.jpa.hibernate.ddl-auto = update
		spring.datasource.url = jdbc: mysql://<host_DB>:<puerto_DB>/<nombre_DB>?serverTimezone=UTC&createDatabaseIfNotExist=true
		spring.datasource.username = <usuario>
		spring.datasource.password= <contrase帽a>
		spring.jpa.database-platform = org.hibernate.dialect.MySQL8Dialect
		portfolio.jwtSecret = <clave_alfanum茅rica_JWT>
		portfolio.jwtExpirationMs = <tiempo_expiraci贸n_JWT> 

 **Dato**: Reemplazar los valores borrando los <>.

### 鉁? C贸mo utilizar la API
------------
En este caso se utiliz贸  plataforma de API [Postman](https://www.postman.com/) para realizar las operaciones AMB (o CRUD) en nuestra base de datos MySQL, adem谩s de autenticar y autorizar usuarios a trav茅s de JWT (JSON Web Token), trabajando en conjunto con nuestro Frontend a trav茅s de peticiones HTTP.


### 馃摡Contacto
------------
馃檵鈥嶁檪锔? En caso de tener alguna duda y te interesa ponerte en contacto conmigo pod茅s hacerlo a trav茅s de:  
#### [LinkedIn](https://www.linkedin.com/in/luisa-markarian-253985246/ "LinkedIn") -  [Mi app](https://portfoliolumarka.web.app/ "Mi app")
