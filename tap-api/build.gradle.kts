/* Modified */
repositories {
    maven("https://libraries.minecraft.net")
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.mariuszgromada.math:MathParser.org-mXparser:4.4.2")
    compileOnly("com.mojang:authlib:1.5.21")
}