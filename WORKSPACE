rules_scala_version="7b9b89b70bfd6935ccfc9886105471ba4b733fd1"

http_archive(
             name = "io_bazel_rules_scala",
             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
             type = "zip",
             strip_prefix= "rules_scala-%s" % rules_scala_version
             )

repo_b_version="8fc25f4b1fe0a9f9c271253636bd9f5d97c55a27"

http_archive(
             name = "repo_b",
             url = "https://github.com/natansil/bazel-repo-b/archive/%s.zip"%repo_b_version,
             type = "zip",
             strip_prefix= "bazel-repo-b-%s" % repo_b_version 
             )

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//specs2:specs2_junit.bzl","specs2_junit_repositories")
specs2_junit_repositories()


