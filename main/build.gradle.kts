dependencies {
    implementation("net.minestom:minestom:${project.property("minestom_version")}")
    implementation("net.kyori:adventure-text-minimessage:${project.property("adventure_version")}")
    implementation("net.kyori:adventure-api:${project.property("adventure_version")}")
    implementation("ch.qos.logback:logback-classic:${project.property("logback_version")}")
}

kotlin {
    jvmToolchain(21)
}