buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(android(androidVersion))
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath(bintrayRelease(bintrayReleaseVersion))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
    tasks.withType(Javadoc::class.java).all { isEnabled = false }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

/** QUICK UPLOAD
./gradlew :kota:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-support-v4:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-appcompat-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-recyclerview-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-preference-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-design:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
 */