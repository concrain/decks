/**
 * Mysql Connection
 */
/*
import groovy.sql.Sql
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.2.5.RELEASE")
        //classpath("mysql:mysql-connector-java:5.1.36")
    }
}

apply plugin: 'java'
apply plugin: 'idea'
apply plugin: 'spring-boot'

jar {
    baseName = 'gs-relational-data-access'
    version =  '0.1.0'
}

repositories {
    mavenCentral()
}

sourceCompatibility = 1.8
targetCompatibility = 1.8

configurations {
    driver
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter")
    compile("org.springframework:spring-jdbc")
    testCompile("junit:junit")

    driver group: 'mysql', name: 'mysql-connector-java', version: '5.1.36'
}

URLClassLoader loader = GroovyObject.class.classLoader
configurations.driver.each { File file ->
    loader.addURL(file.toURL())
}

task connectToDb << {
    def props = [user: 'root', password: '', allowMultiQueries: 'true'] as Properties
    def url = 'jdbc:mysql://localhost:3306/spring'
    def driver = 'com.mysql.jdbc.Driver'
    def sql = Sql.newInstance(url, props, driver)

    sql.eachRow('show tables') { row ->
        println(' table-- ' + row[0])
    }

    sql.eachRow('select * from customers') { row ->
        println(' row-- ' + row)
    }

}

task wrapper(type: Wrapper) {
    gradleVersion = '2.5'
}
*/


//==================================================
//==================================================




/**
 * Oracle Connection
 */

import groovy.sql.Sql

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.2.5.RELEASE")
    }
}

apply plugin: 'java'
apply plugin: 'groovy'
apply plugin: 'idea'
apply plugin: 'spring-boot'

jar {
    baseName = 'gs-relational-data-access'
    version =  '0.1.0'
    into('lib') {
      from 'oraDrv'
    }
}
repositories {
    mavenCentral()
    flatDir(dir: 'lib', name: 'Local lib')
}

configurations {
    driver
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter")
    compile("org.springframework:spring-jdbc")
    compile("org.codehaus.groovy:groovy:2.4.3")
    //compile files("lib/ojdbc6.jar")
    //runtime files("lib/ojdbc6.jar")
    testCompile("junit:junit")
}

task connectToDb << {
    def props = [username: 'irx_dev',
                 password: 'irx_dev',
                 url: 'jdbc:oracle:thin:@viper.anvitahealth.com:1521/viper.anvitahealth.com'] as Properties

    URLClassLoader loader = GroovyObject.class.classLoader
    loader.addURL ( new File('lib/ojdbc6.jar').toURL() )
    Class driverClass = loader.loadClass('oracle.jdbc.OracleDriver')
    java.sql.Driver driverInstance = driverClass.newInstance()
    java.sql.DriverManager.registerDriver(driverInstance)

    groovy.sql.Sql sql = groovy.sql.Sql.newInstance(
    props.url,
    props.username,
    props.password)

    sql.eachRow("SELECT * FROM irx_info")
    {
       println "Query returns ${it}"
    }

}
