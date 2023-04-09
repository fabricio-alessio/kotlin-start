package com.book.objects

import com.book.fields.Person
import java.io.File

fun main() {

    Payroll.addEmployee(Person("Joao", false))
    Payroll.addEmployee(Person("Clara", false))
    Payroll.calculateSalary()

    val files = listOf(File("/Abacate"), File("/zebra"))
    println(files.sortedWith(FileNameIgnoreCaseComparator))

    val persons = listOf(ComparablePerson("Julian"), ComparablePerson("John"))
    println(persons.sortedWith(ComparablePerson.NameComparator))
}

object Payroll {
    private val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        for (person in allEmployees) {
            println("Calculating salary of employee ${person.name}")
        }
    }
    fun addEmployee(person: Person) {
        allEmployees.add(person)
    }
}

object FileNameIgnoreCaseComparator : Comparator<File>{
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

data class ComparablePerson(val name: String) {
    object NameComparator : Comparator<ComparablePerson> {
        override fun compare(p1: ComparablePerson, p2: ComparablePerson): Int {
            return p1.name.compareTo(p2.name)
        }
    }
}