package mygrails

import myService.MyService

class TestController {
	def myService
    def index() { 
		println("HELLO WORD")
	}
	def save() {
		myService.saveMethod()
		println("添加对象")
	}
	def find() {
		myService.findMethod()
		println("查找对象")
	}
	def upd() {
		myService.updMethod()
		println("查找对象")
	}
	def del() {
		myService.delMethod()
		println("查找对象")
	}
}
