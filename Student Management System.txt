Student Management System Demoo


Main Entities are : Student
                    Fees
                    Logins
                    Profiles
                    Courses
                    Exam

Student Entity :    Attributes of student entity are - student_id
                                                       student_college_id
                                                       student_name
                                                       student_mobile
                                                       student_mail
 

Fees Entity : Attributes of fees entity are - fee_id
                                              fee_course_id
                                              fee_amount
                                              fee_discription

Login Entity : Attributes of Login entity are - login_id
                                                login_username
                                                login-password

Course Entity : Attributes of course entity are - course_id
                                                  course_registration
                                                  course_description

Exam Entity : Attributes of exam entity are - exam_id
                                              exam_date
                                              exam_description


Details of students are stored in student table.
There is one-to-one and one-to-many Relationships b/w courses,profiles,exam,student