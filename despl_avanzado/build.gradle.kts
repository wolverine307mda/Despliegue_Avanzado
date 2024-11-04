plugins {
    id("java")
    id("jacoco") // Agrega el plugin de JaCoCo aquí
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// Configuración de Jacoco para generar informes de cobertura
tasks.jacocoTestReport {
    dependsOn(tasks.test) // Asegúrate de que los tests se ejecuten primero
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.required.set(true)
    }
}

// Asegúrate de que jacocoTestReport se ejecute como parte de la tarea de check
tasks.check {
    dependsOn(tasks.jacocoTestReport)
}

// Configuración del JAR ejecutable
tasks.jar {
    archiveFileName.set("my-app.jar") // Nombre del archivo JAR
    manifest {
        attributes["Main-Class"] = "org.example.Main" // Cambia esto si tu clase principal tiene otro nombre
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}
