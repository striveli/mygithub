package myService

import java.lang.invoke.LambdaForm.Name;

import grails.transaction.Transactional
import myDomain.MyStudent

@Transactional
class MyService {

    def saveMethod() {
		def myStudent = new MyStudent(id: 2, name: "测试1")
		myStudent.save()
    }
	def findMethod(){
		def myStudent = MyStudent.get(1)
		println myStudent
	}
	def updMethod(){
		def myStudent = MyStudent.get(1)
		myStudent.save(name:"测试一")
	}
	def delMethod(){
		def myStudent = MyStudent.get(1)
		myStudent.delete()
	}
}
