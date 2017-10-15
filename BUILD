package(default_visibility = ["//visibility:public"])

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_specs2_junit_test", "scala_binary")

scala_library(
    name="a",
    srcs=[
        "A.scala",
        ],
    deps=[
        "@repo_b//:b"
        ],
)
