package com.intelligentbackpack.reminderdata.datasource

import calendar.communication.Lesson
import calendar.communication.Subject

/**
 * Remote data source for the reminder module.
 */
interface ReminderRemoteDataSource {

    /**
     * Downloads the current year.
     *
     * @return the current year.
     */
    suspend fun downloadYear(): String

    /**
     * Downloads the subjects.
     *
     * @return the subjects.
     */
    suspend fun downloadSubjects(): List<Subject>

    /**
     * Downloads the lessons for the student in the given year.
     *
     * @param email the email of the student.
     * @param year the year.
     * @return the lessons.
     */
    suspend fun downloadLessonsForStudent(email: String, year: String): List<Lesson>

    /**
     * Downloads the lessons for the professor in the given year.
     *
     * @param email the email of the professor.
     * @param year the year.
     * @return the lessons.
     */
    suspend fun downloadLessonsForProfessor(email: String, year: String): List<Lesson>

    /**
     * Downloads the books for the given lesson.
     *
     * @param lesson the lesson.
     * @return the books.
     */
    suspend fun downloadBooksForLesson(lesson: Lesson): List<String>

    /**
     * Creates a new reminder for the given lesson.
     *
     * @param email the email of the student.
     * @param lesson the lesson.
     * @param isbn the isbn of the book.
     * @return the id of the reminder.
     */
    suspend fun createNewReminderForLesson(email: String, lesson: Lesson, isbn: String): String
}
