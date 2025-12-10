import testing.TestExtension

project.extensions.create<TestExtension>(
    "test1"
)

(project.extensions.getByType<PublishingExtension>() as? ExtensionAware)?.extensions?.create<TestExtension>(
    "test2"
)

(project.extensions.getByType<PublishingExtension>().repositories as? ExtensionAware)?.extensions?.create<TestExtension>(
    "test3"
)

