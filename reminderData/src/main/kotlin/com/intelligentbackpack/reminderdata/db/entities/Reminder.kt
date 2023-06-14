package com.intelligentbackpack.reminderdata.db.entities

import java.time.LocalDate

@androidx.room.Entity(
    tableName = "Reminders",
    foreignKeys = [
        androidx.room.ForeignKey(
            entity = Lesson::class,
            parentColumns = ["id"],
            childColumns = ["lesson_id"],
            onDelete = androidx.room.ForeignKey.CASCADE,
        ),
    ],
    indices = [
        androidx.room.Index(value = ["lesson_id"]),
    ],
)
data class Reminder(
    @androidx.room.PrimaryKey(autoGenerate = true)
    val id: Int,

    @androidx.room.ColumnInfo(name = "lesson_id")
    val lessonId: Int,
    val isbn: String,

    @androidx.room.ColumnInfo(name = "from_date")
    val fromDate: LocalDate,

    @androidx.room.ColumnInfo(name = "to_date")
    val toDate: LocalDate,
)
