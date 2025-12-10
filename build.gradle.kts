plugins {
    id("maven-publish")
    id("test-conventions")
}
// works
test1 {
    hello()
}

publishing {
    // works
    test2 {
        hello()
    }
    repositories {
        // does not work:
        test3 {
            hello()
        }
    }
}

