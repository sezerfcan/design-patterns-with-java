plugins {
    id("java")
}

allprojects {
    group = "org.cansezer"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

}

subprojects {

    apply(plugin = "java")


    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF8"
    }


    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(22))
        }
    }

}


tasks.named<Delete>("clean") {
    delete(rootProject.layout.buildDirectory.get().asFile)
}



tasks.test {
    useJUnitPlatform()
}