# api-order-management-v1

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/api-order-management-v1-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- REST ([guide](https://quarkus.io/guides/rest)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## comandos extras clase
devservices:
enable: true
db-name: db_konsulta_cambio
port: 5432
image-name: postgres:16-alpine

esta cofiguracion es para docker si no tienes bd instalado
comando crear bd en docker

docker run -d --name postgres-db -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=123456789 -e POSTGRES_DB=db_konsulta_cambio -p 5432:5432 postgres:16-alpine

CREATE TABLE public.tb_query_log (
id uuid NOT null,
dni varchar(20) NULL,
sunat decimal(12,3) NULL,
compra decimal(12,3) NULL,
venta decimal(12,3) NULL,
CONSTRAINT tb_query_log_pk PRIMARY KEY (id)
);

cambiar perfiles application
agregar: Dquarkus.profile=dev

clean compile quarkus:dev -Dquarkus.profile=dev
app.config.password = valor
app.config.email    = john@mail.com
app.config.password = changeme

formato avro (json) para guardar en el topico producer 
2 particiones






