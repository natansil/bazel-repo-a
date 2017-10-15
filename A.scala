package com.example

object A {
	def foo = {
                println("In A")
		B.foo
	}
}
