
package com.example.graduation_project.model.Questionnaires;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Questionnaire implements Serializable
{

    @SerializedName("subject_id")
    @Expose
    private String subjectId;
    @SerializedName("doctor_id")
    @Expose
    private String doctorId;
    @SerializedName("assistant_id")
    @Expose
    private String assistantId;
    @SerializedName("course_is_interesting")
    @Expose
    private String courseIsInteresting;
    @SerializedName("course_related_to_specialization")
    @Expose
    private String courseRelatedToSpecialization;
    @SerializedName("course_contain_new_information")
    @Expose
    private String courseContainNewInformation;
    @SerializedName("course_matches_my_expectations")
    @Expose
    private String courseMatchesMyExpectations;
    @SerializedName("course_is_useful_in_practical")
    @Expose
    private String courseIsUsefulInPractical;
    @SerializedName("course_understood")
    @Expose
    private String courseUnderstood;
    @SerializedName("course_overall_good")
    @Expose
    private String courseOverallGood;
    @SerializedName("course_has_clear_objective")
    @Expose
    private String courseHasClearObjective;
    @SerializedName("course_provide_useful_and_depth_understanding")
    @Expose
    private String courseProvideUsefulAndDepthUnderstanding;
    @SerializedName("course_motivates_me_to_think")
    @Expose
    private String courseMotivatesMeToThink;
    @SerializedName("course_give_me_professional_skills")
    @Expose
    private String courseGiveMeProfessionalSkills;
    @SerializedName("lectures_presented_in_order_of_tables")
    @Expose
    private String lecturesPresentedInOrderOfTables;
    @SerializedName("lectures_contribute_to_understanding_the_course")
    @Expose
    private String lecturesContributeToUnderstandingTheCourse;
    @SerializedName("lectures_cover_course_subjects")
    @Expose
    private String lecturesCoverCourseSubjects;
    @SerializedName("lectures_presented_in_interesting_way")
    @Expose
    private String lecturesPresentedInInterestingWay;
    @SerializedName("lectures_included_students_participation")
    @Expose
    private String lecturesIncludedStudentsParticipation;
    @SerializedName("lectures_included_practicability")
    @Expose
    private String lecturesIncludedPracticability;
    @SerializedName("amount_of_information_presented_in_lecture_is_appropriate")
    @Expose
    private String amountOfInformationPresentedInLectureIsAppropriate;
    @SerializedName("course_book_is_appropriate")
    @Expose
    private String courseBookIsAppropriate;
    @SerializedName("doctor_committed_by_content_of_course")
    @Expose
    private String doctorCommittedByContentOfCourse;
    @SerializedName("doctor_committed_by_lecture_time")
    @Expose
    private String doctorCommittedByLectureTime;
    @SerializedName("doctor_always_ready_for_lecture")
    @Expose
    private String doctorAlwaysReadyForLecture;
    @SerializedName("doctor_deals_with_subjects_in_depth")
    @Expose
    private String doctorDealsWithSubjectsInDepth;
    @SerializedName("doctor_support_students_for_asking")
    @Expose
    private String doctorSupportStudentsForAsking;
    @SerializedName("doctor_investing_lecture_time_in_teaching")
    @Expose
    private String doctorInvestingLectureTimeInTeaching;
    @SerializedName("doctor_seems_have_high_knowledge_of_course_subjects")
    @Expose
    private String doctorSeemsHaveHighKnowledgeOfCourseSubjects;
    @SerializedName("doctor_attracted_my_attention")
    @Expose
    private String doctorAttractedMyAttention;
    @SerializedName("doctor_treats_students_with_respect")
    @Expose
    private String doctorTreatsStudentsWithRespect;
    @SerializedName("doctor_provides_real_examples")
    @Expose
    private String doctorProvidesRealExamples;
    @SerializedName("doctor_assistant_is_effective")
    @Expose
    private String doctorAssistantIsEffective;
    @SerializedName("doctor_assistant_always_ready_for_answer_any_question")
    @Expose
    private String doctorAssistantAlwaysReadyForAnswerAnyQuestion;
    @SerializedName("doctor_assistant_seems_knew_course_subjects")
    @Expose
    private String doctorAssistantSeemsKnewCourseSubjects;
    @SerializedName("doctor_assistant_provides_enough_real_examples")
    @Expose
    private String doctorAssistantProvidesEnoughRealExamples;
    @SerializedName("doctor_assistant_provides_help_for_students")
    @Expose
    private String doctorAssistantProvidesHelpForStudents;
    @SerializedName("exams_schedule_appropriate")
    @Expose
    private String examsScheduleAppropriate;
    @SerializedName("exams_dates_are_announced_early")
    @Expose
    private String examsDatesAreAnnouncedEarly;
    @SerializedName("number_of_semester_exams_are_appropriate")
    @Expose
    private String numberOfSemesterExamsAreAppropriate;
    @SerializedName("exams_are_objective")
    @Expose
    private String examsAreObjective;
    @SerializedName("exams_time_are_appropriate")
    @Expose
    private String examsTimeAreAppropriate;
    @SerializedName("exams_cover_course_subjects")
    @Expose
    private String examsCoverCourseSubjects;
    @SerializedName("exams_cover_theoretical_and_practical_aspects")
    @Expose
    private String examsCoverTheoreticalAndPracticalAspects;
    @SerializedName("exams_language_be_understood")
    @Expose
    private String examsLanguageBeUnderstood;
    @SerializedName("exams_question_not_contain_spelling_mistakes")
    @Expose
    private String examsQuestionNotContainSpellingMistakes;
    @SerializedName("exams_distribution_of_grades_is_fair")
    @Expose
    private String examsDistributionOfGradesIsFair;
    @SerializedName("institute_provides_enough_factories")
    @Expose
    private String instituteProvidesEnoughFactories;
    @SerializedName("factories_has_modern_equipment")
    @Expose
    private String factoriesHasModernEquipment;
    @SerializedName("factories_design_is_attractive")
    @Expose
    private String factoriesDesignIsAttractive;
    @SerializedName("factories_technicians_characterized_by_high_efficiency")
    @Expose
    private String factoriesTechniciansCharacterizedByHighEfficiency;
    @SerializedName("factories_space_are_enough_for_students")
    @Expose
    private String factoriesSpaceAreEnoughForStudents;
    @SerializedName("workshops_has_modern_equipment")
    @Expose
    private String workshopsHasModernEquipment;
    @SerializedName("workshops_space_are_enough_for_students")
    @Expose
    private String workshopsSpaceAreEnoughForStudents;
    @SerializedName("workshops_technicians_characterized_by_high_efficiency")
    @Expose
    private String workshopsTechniciansCharacterizedByHighEfficiency;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("number_of_chairs")
    @Expose
    private String numberOfChairs;
    @SerializedName("teaching_facilities")
    @Expose
    private String teachingFacilities;
    @SerializedName("quiet")
    @Expose
    private String quiet;
    @SerializedName("lighting")
    @Expose
    private String lighting;
    @SerializedName("cleanliness")
    @Expose
    private String cleanliness;
    @SerializedName("i_like_in_course")
    @Expose
    private String iLikeInCourse;
    @SerializedName("not_like_in_course")
    @Expose
    private String notLikeInCourse;
    @SerializedName("how_to_improve_this_course")
    @Expose
    private String howToImproveThisCourse;
    @SerializedName("user_id")
    @Expose
    private int userId;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private int id;
    private final static long serialVersionUID = -8035842884756456340L;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getCourseIsInteresting() {
        return courseIsInteresting;
    }

    public void setCourseIsInteresting(String courseIsInteresting) {
        this.courseIsInteresting = courseIsInteresting;
    }

    public String getCourseRelatedToSpecialization() {
        return courseRelatedToSpecialization;
    }

    public void setCourseRelatedToSpecialization(String courseRelatedToSpecialization) {
        this.courseRelatedToSpecialization = courseRelatedToSpecialization;
    }

    public String getCourseContainNewInformation() {
        return courseContainNewInformation;
    }

    public void setCourseContainNewInformation(String courseContainNewInformation) {
        this.courseContainNewInformation = courseContainNewInformation;
    }

    public String getCourseMatchesMyExpectations() {
        return courseMatchesMyExpectations;
    }

    public void setCourseMatchesMyExpectations(String courseMatchesMyExpectations) {
        this.courseMatchesMyExpectations = courseMatchesMyExpectations;
    }

    public String getCourseIsUsefulInPractical() {
        return courseIsUsefulInPractical;
    }

    public void setCourseIsUsefulInPractical(String courseIsUsefulInPractical) {
        this.courseIsUsefulInPractical = courseIsUsefulInPractical;
    }

    public String getCourseUnderstood() {
        return courseUnderstood;
    }

    public void setCourseUnderstood(String courseUnderstood) {
        this.courseUnderstood = courseUnderstood;
    }

    public String getCourseOverallGood() {
        return courseOverallGood;
    }

    public void setCourseOverallGood(String courseOverallGood) {
        this.courseOverallGood = courseOverallGood;
    }

    public String getCourseHasClearObjective() {
        return courseHasClearObjective;
    }

    public void setCourseHasClearObjective(String courseHasClearObjective) {
        this.courseHasClearObjective = courseHasClearObjective;
    }

    public String getCourseProvideUsefulAndDepthUnderstanding() {
        return courseProvideUsefulAndDepthUnderstanding;
    }

    public void setCourseProvideUsefulAndDepthUnderstanding(String courseProvideUsefulAndDepthUnderstanding) {
        this.courseProvideUsefulAndDepthUnderstanding = courseProvideUsefulAndDepthUnderstanding;
    }

    public String getCourseMotivatesMeToThink() {
        return courseMotivatesMeToThink;
    }

    public void setCourseMotivatesMeToThink(String courseMotivatesMeToThink) {
        this.courseMotivatesMeToThink = courseMotivatesMeToThink;
    }

    public String getCourseGiveMeProfessionalSkills() {
        return courseGiveMeProfessionalSkills;
    }

    public void setCourseGiveMeProfessionalSkills(String courseGiveMeProfessionalSkills) {
        this.courseGiveMeProfessionalSkills = courseGiveMeProfessionalSkills;
    }

    public String getLecturesPresentedInOrderOfTables() {
        return lecturesPresentedInOrderOfTables;
    }

    public void setLecturesPresentedInOrderOfTables(String lecturesPresentedInOrderOfTables) {
        this.lecturesPresentedInOrderOfTables = lecturesPresentedInOrderOfTables;
    }

    public String getLecturesContributeToUnderstandingTheCourse() {
        return lecturesContributeToUnderstandingTheCourse;
    }

    public void setLecturesContributeToUnderstandingTheCourse(String lecturesContributeToUnderstandingTheCourse) {
        this.lecturesContributeToUnderstandingTheCourse = lecturesContributeToUnderstandingTheCourse;
    }

    public String getLecturesCoverCourseSubjects() {
        return lecturesCoverCourseSubjects;
    }

    public void setLecturesCoverCourseSubjects(String lecturesCoverCourseSubjects) {
        this.lecturesCoverCourseSubjects = lecturesCoverCourseSubjects;
    }

    public String getLecturesPresentedInInterestingWay() {
        return lecturesPresentedInInterestingWay;
    }

    public void setLecturesPresentedInInterestingWay(String lecturesPresentedInInterestingWay) {
        this.lecturesPresentedInInterestingWay = lecturesPresentedInInterestingWay;
    }

    public String getLecturesIncludedStudentsParticipation() {
        return lecturesIncludedStudentsParticipation;
    }

    public void setLecturesIncludedStudentsParticipation(String lecturesIncludedStudentsParticipation) {
        this.lecturesIncludedStudentsParticipation = lecturesIncludedStudentsParticipation;
    }

    public String getLecturesIncludedPracticability() {
        return lecturesIncludedPracticability;
    }

    public void setLecturesIncludedPracticability(String lecturesIncludedPracticability) {
        this.lecturesIncludedPracticability = lecturesIncludedPracticability;
    }

    public String getAmountOfInformationPresentedInLectureIsAppropriate() {
        return amountOfInformationPresentedInLectureIsAppropriate;
    }

    public void setAmountOfInformationPresentedInLectureIsAppropriate(String amountOfInformationPresentedInLectureIsAppropriate) {
        this.amountOfInformationPresentedInLectureIsAppropriate = amountOfInformationPresentedInLectureIsAppropriate;
    }

    public String getCourseBookIsAppropriate() {
        return courseBookIsAppropriate;
    }

    public void setCourseBookIsAppropriate(String courseBookIsAppropriate) {
        this.courseBookIsAppropriate = courseBookIsAppropriate;
    }

    public String getDoctorCommittedByContentOfCourse() {
        return doctorCommittedByContentOfCourse;
    }

    public void setDoctorCommittedByContentOfCourse(String doctorCommittedByContentOfCourse) {
        this.doctorCommittedByContentOfCourse = doctorCommittedByContentOfCourse;
    }

    public String getDoctorCommittedByLectureTime() {
        return doctorCommittedByLectureTime;
    }

    public void setDoctorCommittedByLectureTime(String doctorCommittedByLectureTime) {
        this.doctorCommittedByLectureTime = doctorCommittedByLectureTime;
    }

    public String getDoctorAlwaysReadyForLecture() {
        return doctorAlwaysReadyForLecture;
    }

    public void setDoctorAlwaysReadyForLecture(String doctorAlwaysReadyForLecture) {
        this.doctorAlwaysReadyForLecture = doctorAlwaysReadyForLecture;
    }

    public String getDoctorDealsWithSubjectsInDepth() {
        return doctorDealsWithSubjectsInDepth;
    }

    public void setDoctorDealsWithSubjectsInDepth(String doctorDealsWithSubjectsInDepth) {
        this.doctorDealsWithSubjectsInDepth = doctorDealsWithSubjectsInDepth;
    }

    public String getDoctorSupportStudentsForAsking() {
        return doctorSupportStudentsForAsking;
    }

    public void setDoctorSupportStudentsForAsking(String doctorSupportStudentsForAsking) {
        this.doctorSupportStudentsForAsking = doctorSupportStudentsForAsking;
    }

    public String getDoctorInvestingLectureTimeInTeaching() {
        return doctorInvestingLectureTimeInTeaching;
    }

    public void setDoctorInvestingLectureTimeInTeaching(String doctorInvestingLectureTimeInTeaching) {
        this.doctorInvestingLectureTimeInTeaching = doctorInvestingLectureTimeInTeaching;
    }

    public String getDoctorSeemsHaveHighKnowledgeOfCourseSubjects() {
        return doctorSeemsHaveHighKnowledgeOfCourseSubjects;
    }

    public void setDoctorSeemsHaveHighKnowledgeOfCourseSubjects(String doctorSeemsHaveHighKnowledgeOfCourseSubjects) {
        this.doctorSeemsHaveHighKnowledgeOfCourseSubjects = doctorSeemsHaveHighKnowledgeOfCourseSubjects;
    }

    public String getDoctorAttractedMyAttention() {
        return doctorAttractedMyAttention;
    }

    public void setDoctorAttractedMyAttention(String doctorAttractedMyAttention) {
        this.doctorAttractedMyAttention = doctorAttractedMyAttention;
    }

    public String getDoctorTreatsStudentsWithRespect() {
        return doctorTreatsStudentsWithRespect;
    }

    public void setDoctorTreatsStudentsWithRespect(String doctorTreatsStudentsWithRespect) {
        this.doctorTreatsStudentsWithRespect = doctorTreatsStudentsWithRespect;
    }

    public String getDoctorProvidesRealExamples() {
        return doctorProvidesRealExamples;
    }

    public void setDoctorProvidesRealExamples(String doctorProvidesRealExamples) {
        this.doctorProvidesRealExamples = doctorProvidesRealExamples;
    }

    public String getDoctorAssistantIsEffective() {
        return doctorAssistantIsEffective;
    }

    public void setDoctorAssistantIsEffective(String doctorAssistantIsEffective) {
        this.doctorAssistantIsEffective = doctorAssistantIsEffective;
    }

    public String getDoctorAssistantAlwaysReadyForAnswerAnyQuestion() {
        return doctorAssistantAlwaysReadyForAnswerAnyQuestion;
    }

    public void setDoctorAssistantAlwaysReadyForAnswerAnyQuestion(String doctorAssistantAlwaysReadyForAnswerAnyQuestion) {
        this.doctorAssistantAlwaysReadyForAnswerAnyQuestion = doctorAssistantAlwaysReadyForAnswerAnyQuestion;
    }

    public String getDoctorAssistantSeemsKnewCourseSubjects() {
        return doctorAssistantSeemsKnewCourseSubjects;
    }

    public void setDoctorAssistantSeemsKnewCourseSubjects(String doctorAssistantSeemsKnewCourseSubjects) {
        this.doctorAssistantSeemsKnewCourseSubjects = doctorAssistantSeemsKnewCourseSubjects;
    }

    public String getDoctorAssistantProvidesEnoughRealExamples() {
        return doctorAssistantProvidesEnoughRealExamples;
    }

    public void setDoctorAssistantProvidesEnoughRealExamples(String doctorAssistantProvidesEnoughRealExamples) {
        this.doctorAssistantProvidesEnoughRealExamples = doctorAssistantProvidesEnoughRealExamples;
    }

    public String getDoctorAssistantProvidesHelpForStudents() {
        return doctorAssistantProvidesHelpForStudents;
    }

    public void setDoctorAssistantProvidesHelpForStudents(String doctorAssistantProvidesHelpForStudents) {
        this.doctorAssistantProvidesHelpForStudents = doctorAssistantProvidesHelpForStudents;
    }

    public String getExamsScheduleAppropriate() {
        return examsScheduleAppropriate;
    }

    public void setExamsScheduleAppropriate(String examsScheduleAppropriate) {
        this.examsScheduleAppropriate = examsScheduleAppropriate;
    }

    public String getExamsDatesAreAnnouncedEarly() {
        return examsDatesAreAnnouncedEarly;
    }

    public void setExamsDatesAreAnnouncedEarly(String examsDatesAreAnnouncedEarly) {
        this.examsDatesAreAnnouncedEarly = examsDatesAreAnnouncedEarly;
    }

    public String getNumberOfSemesterExamsAreAppropriate() {
        return numberOfSemesterExamsAreAppropriate;
    }

    public void setNumberOfSemesterExamsAreAppropriate(String numberOfSemesterExamsAreAppropriate) {
        this.numberOfSemesterExamsAreAppropriate = numberOfSemesterExamsAreAppropriate;
    }

    public String getExamsAreObjective() {
        return examsAreObjective;
    }

    public void setExamsAreObjective(String examsAreObjective) {
        this.examsAreObjective = examsAreObjective;
    }

    public String getExamsTimeAreAppropriate() {
        return examsTimeAreAppropriate;
    }

    public void setExamsTimeAreAppropriate(String examsTimeAreAppropriate) {
        this.examsTimeAreAppropriate = examsTimeAreAppropriate;
    }

    public String getExamsCoverCourseSubjects() {
        return examsCoverCourseSubjects;
    }

    public void setExamsCoverCourseSubjects(String examsCoverCourseSubjects) {
        this.examsCoverCourseSubjects = examsCoverCourseSubjects;
    }

    public String getExamsCoverTheoreticalAndPracticalAspects() {
        return examsCoverTheoreticalAndPracticalAspects;
    }

    public void setExamsCoverTheoreticalAndPracticalAspects(String examsCoverTheoreticalAndPracticalAspects) {
        this.examsCoverTheoreticalAndPracticalAspects = examsCoverTheoreticalAndPracticalAspects;
    }

    public String getExamsLanguageBeUnderstood() {
        return examsLanguageBeUnderstood;
    }

    public void setExamsLanguageBeUnderstood(String examsLanguageBeUnderstood) {
        this.examsLanguageBeUnderstood = examsLanguageBeUnderstood;
    }

    public String getExamsQuestionNotContainSpellingMistakes() {
        return examsQuestionNotContainSpellingMistakes;
    }

    public void setExamsQuestionNotContainSpellingMistakes(String examsQuestionNotContainSpellingMistakes) {
        this.examsQuestionNotContainSpellingMistakes = examsQuestionNotContainSpellingMistakes;
    }

    public String getExamsDistributionOfGradesIsFair() {
        return examsDistributionOfGradesIsFair;
    }

    public void setExamsDistributionOfGradesIsFair(String examsDistributionOfGradesIsFair) {
        this.examsDistributionOfGradesIsFair = examsDistributionOfGradesIsFair;
    }

    public String getInstituteProvidesEnoughFactories() {
        return instituteProvidesEnoughFactories;
    }

    public void setInstituteProvidesEnoughFactories(String instituteProvidesEnoughFactories) {
        this.instituteProvidesEnoughFactories = instituteProvidesEnoughFactories;
    }

    public String getFactoriesHasModernEquipment() {
        return factoriesHasModernEquipment;
    }

    public void setFactoriesHasModernEquipment(String factoriesHasModernEquipment) {
        this.factoriesHasModernEquipment = factoriesHasModernEquipment;
    }

    public String getFactoriesDesignIsAttractive() {
        return factoriesDesignIsAttractive;
    }

    public void setFactoriesDesignIsAttractive(String factoriesDesignIsAttractive) {
        this.factoriesDesignIsAttractive = factoriesDesignIsAttractive;
    }

    public String getFactoriesTechniciansCharacterizedByHighEfficiency() {
        return factoriesTechniciansCharacterizedByHighEfficiency;
    }

    public void setFactoriesTechniciansCharacterizedByHighEfficiency(String factoriesTechniciansCharacterizedByHighEfficiency) {
        this.factoriesTechniciansCharacterizedByHighEfficiency = factoriesTechniciansCharacterizedByHighEfficiency;
    }

    public String getFactoriesSpaceAreEnoughForStudents() {
        return factoriesSpaceAreEnoughForStudents;
    }

    public void setFactoriesSpaceAreEnoughForStudents(String factoriesSpaceAreEnoughForStudents) {
        this.factoriesSpaceAreEnoughForStudents = factoriesSpaceAreEnoughForStudents;
    }

    public String getWorkshopsHasModernEquipment() {
        return workshopsHasModernEquipment;
    }

    public void setWorkshopsHasModernEquipment(String workshopsHasModernEquipment) {
        this.workshopsHasModernEquipment = workshopsHasModernEquipment;
    }

    public String getWorkshopsSpaceAreEnoughForStudents() {
        return workshopsSpaceAreEnoughForStudents;
    }

    public void setWorkshopsSpaceAreEnoughForStudents(String workshopsSpaceAreEnoughForStudents) {
        this.workshopsSpaceAreEnoughForStudents = workshopsSpaceAreEnoughForStudents;
    }

    public String getWorkshopsTechniciansCharacterizedByHighEfficiency() {
        return workshopsTechniciansCharacterizedByHighEfficiency;
    }

    public void setWorkshopsTechniciansCharacterizedByHighEfficiency(String workshopsTechniciansCharacterizedByHighEfficiency) {
        this.workshopsTechniciansCharacterizedByHighEfficiency = workshopsTechniciansCharacterizedByHighEfficiency;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(String numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public String getTeachingFacilities() {
        return teachingFacilities;
    }

    public void setTeachingFacilities(String teachingFacilities) {
        this.teachingFacilities = teachingFacilities;
    }

    public String getQuiet() {
        return quiet;
    }

    public void setQuiet(String quiet) {
        this.quiet = quiet;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public String getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(String cleanliness) {
        this.cleanliness = cleanliness;
    }

    public String getILikeInCourse() {
        return iLikeInCourse;
    }

    public void setILikeInCourse(String iLikeInCourse) {
        this.iLikeInCourse = iLikeInCourse;
    }

    public String getNotLikeInCourse() {
        return notLikeInCourse;
    }

    public void setNotLikeInCourse(String notLikeInCourse) {
        this.notLikeInCourse = notLikeInCourse;
    }

    public String getHowToImproveThisCourse() {
        return howToImproveThisCourse;
    }

    public void setHowToImproveThisCourse(String howToImproveThisCourse) {
        this.howToImproveThisCourse = howToImproveThisCourse;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
