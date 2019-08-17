
package com.example.graduation_project.model.QResult;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoriesRules implements Serializable
{

    @SerializedName("opinions_about_course_totally_agree")
    @Expose
    private double opinionsAboutCourseTotallyAgree;
    @SerializedName("opinions_about_course_agree")
    @Expose
    private double opinionsAboutCourseAgree;
    @SerializedName("opinions_about_course_fairly")
    @Expose
    private double opinionsAboutCourseFairly;
    @SerializedName("opinions_about_course_disagree")
    @Expose
    private int opinionsAboutCourseDisagree;
    @SerializedName("opinions_about_course_totally_disagree")
    @Expose
    private int opinionsAboutCourseTotallyDisagree;
    @SerializedName("opinions_about_course")
    @Expose
    private int opinionsAboutCourse;
    @SerializedName("targeted_learning_outcomes_totally_agree")
    @Expose
    private int targetedLearningOutcomesTotallyAgree;
    @SerializedName("targeted_learning_outcomes_agree")
    @Expose
    private int targetedLearningOutcomesAgree;
    @SerializedName("targeted_learning_outcomes_fairly")
    @Expose
    private int targetedLearningOutcomesFairly;
    @SerializedName("targeted_learning_outcomes_disagree")
    @Expose
    private int targetedLearningOutcomesDisagree;
    @SerializedName("targeted_learning_outcomes_totally_disagree")
    @Expose
    private int targetedLearningOutcomesTotallyDisagree;
    @SerializedName("targeted_learning_outcomes")
    @Expose
    private int targetedLearningOutcomes;
    @SerializedName("lectures_totally_agree")
    @Expose
    private int lecturesTotallyAgree;
    @SerializedName("lectures_agree")
    @Expose
    private double lecturesAgree;
    @SerializedName("lectures_fairly")
    @Expose
    private double lecturesFairly;
    @SerializedName("lectures_disagree")
    @Expose
    private double lecturesDisagree;
    @SerializedName("lectures_totally_disagree")
    @Expose
    private double lecturesTotallyDisagree;
    @SerializedName("lectures")
    @Expose
    private int lectures;
    @SerializedName("doctor_totally_agree")
    @Expose
    private int doctorTotallyAgree;
    @SerializedName("doctor_agree")
    @Expose
    private int doctorAgree;
    @SerializedName("doctor_fairly")
    @Expose
    private int doctorFairly;
    @SerializedName("doctor_disagree")
    @Expose
    private int doctorDisagree;
    @SerializedName("doctor_totally_disagree")
    @Expose
    private int doctorTotallyDisagree;
    @SerializedName("doctor")
    @Expose
    private int doctor;
    @SerializedName("doctor_assistant_totally_agree")
    @Expose
    private int doctorAssistantTotallyAgree;
    @SerializedName("doctor_assistant_agree")
    @Expose
    private int doctorAssistantAgree;
    @SerializedName("doctor_assistant_fairly")
    @Expose
    private int doctorAssistantFairly;
    @SerializedName("doctor_assistant_disagree")
    @Expose
    private int doctorAssistantDisagree;
    @SerializedName("doctor_assistant_totally_disagree")
    @Expose
    private int doctorAssistantTotallyDisagree;
    @SerializedName("doctor_assistant")
    @Expose
    private int doctorAssistant;
    @SerializedName("evolution_system_totally_agree")
    @Expose
    private int evolutionSystemTotallyAgree;
    @SerializedName("evolution_system_agree")
    @Expose
    private int evolutionSystemAgree;
    @SerializedName("evolution_system_fairly")
    @Expose
    private int evolutionSystemFairly;
    @SerializedName("evolution_system_disagree")
    @Expose
    private int evolutionSystemDisagree;
    @SerializedName("evolution_system_totally_disagree")
    @Expose
    private int evolutionSystemTotallyDisagree;
    @SerializedName("evolution_system")
    @Expose
    private int evolutionSystem;
    @SerializedName("factories_and_workshops_totally_agree")
    @Expose
    private double factoriesAndWorkshopsTotallyAgree;
    @SerializedName("factories_and_workshops_agree")
    @Expose
    private double factoriesAndWorkshopsAgree;
    @SerializedName("factories_and_workshops_fairly")
    @Expose
    private double factoriesAndWorkshopsFairly;
    @SerializedName("factories_and_workshops_disagree")
    @Expose
    private double factoriesAndWorkshopsDisagree;
    @SerializedName("factories_and_workshops_totally_disagree")
    @Expose
    private int factoriesAndWorkshopsTotallyDisagree;
    @SerializedName("factories_and_workshops")
    @Expose
    private int factoriesAndWorkshops;
    @SerializedName("stands_and_rooms_totally_agree")
    @Expose
    private double standsAndRoomsTotallyAgree;
    @SerializedName("stands_and_rooms_agree")
    @Expose
    private int standsAndRoomsAgree;
    @SerializedName("stands_and_rooms_fairly")
    @Expose
    private int standsAndRoomsFairly;
    @SerializedName("stands_and_rooms_disagree")
    @Expose
    private double standsAndRoomsDisagree;
    @SerializedName("stands_and_rooms_totally_disagree")
    @Expose
    private double standsAndRoomsTotallyDisagree;
    @SerializedName("stands_and_rooms")
    @Expose
    private int standsAndRooms;
    private final static long serialVersionUID = -3693282813423748319L;

    public double getOpinionsAboutCourseTotallyAgree() {
        return opinionsAboutCourseTotallyAgree;
    }

    public void setOpinionsAboutCourseTotallyAgree(double opinionsAboutCourseTotallyAgree) {
        this.opinionsAboutCourseTotallyAgree = opinionsAboutCourseTotallyAgree;
    }

    public double getOpinionsAboutCourseAgree() {
        return opinionsAboutCourseAgree;
    }

    public void setOpinionsAboutCourseAgree(double opinionsAboutCourseAgree) {
        this.opinionsAboutCourseAgree = opinionsAboutCourseAgree;
    }

    public double getOpinionsAboutCourseFairly() {
        return opinionsAboutCourseFairly;
    }

    public void setOpinionsAboutCourseFairly(double opinionsAboutCourseFairly) {
        this.opinionsAboutCourseFairly = opinionsAboutCourseFairly;
    }

    public int getOpinionsAboutCourseDisagree() {
        return opinionsAboutCourseDisagree;
    }

    public void setOpinionsAboutCourseDisagree(int opinionsAboutCourseDisagree) {
        this.opinionsAboutCourseDisagree = opinionsAboutCourseDisagree;
    }

    public int getOpinionsAboutCourseTotallyDisagree() {
        return opinionsAboutCourseTotallyDisagree;
    }

    public void setOpinionsAboutCourseTotallyDisagree(int opinionsAboutCourseTotallyDisagree) {
        this.opinionsAboutCourseTotallyDisagree = opinionsAboutCourseTotallyDisagree;
    }

    public int getOpinionsAboutCourse() {
        return opinionsAboutCourse;
    }

    public void setOpinionsAboutCourse(int opinionsAboutCourse) {
        this.opinionsAboutCourse = opinionsAboutCourse;
    }

    public int getTargetedLearningOutcomesTotallyAgree() {
        return targetedLearningOutcomesTotallyAgree;
    }

    public void setTargetedLearningOutcomesTotallyAgree(int targetedLearningOutcomesTotallyAgree) {
        this.targetedLearningOutcomesTotallyAgree = targetedLearningOutcomesTotallyAgree;
    }

    public int getTargetedLearningOutcomesAgree() {
        return targetedLearningOutcomesAgree;
    }

    public void setTargetedLearningOutcomesAgree(int targetedLearningOutcomesAgree) {
        this.targetedLearningOutcomesAgree = targetedLearningOutcomesAgree;
    }

    public int getTargetedLearningOutcomesFairly() {
        return targetedLearningOutcomesFairly;
    }

    public void setTargetedLearningOutcomesFairly(int targetedLearningOutcomesFairly) {
        this.targetedLearningOutcomesFairly = targetedLearningOutcomesFairly;
    }

    public int getTargetedLearningOutcomesDisagree() {
        return targetedLearningOutcomesDisagree;
    }

    public void setTargetedLearningOutcomesDisagree(int targetedLearningOutcomesDisagree) {
        this.targetedLearningOutcomesDisagree = targetedLearningOutcomesDisagree;
    }

    public int getTargetedLearningOutcomesTotallyDisagree() {
        return targetedLearningOutcomesTotallyDisagree;
    }

    public void setTargetedLearningOutcomesTotallyDisagree(int targetedLearningOutcomesTotallyDisagree) {
        this.targetedLearningOutcomesTotallyDisagree = targetedLearningOutcomesTotallyDisagree;
    }

    public int getTargetedLearningOutcomes() {
        return targetedLearningOutcomes;
    }

    public void setTargetedLearningOutcomes(int targetedLearningOutcomes) {
        this.targetedLearningOutcomes = targetedLearningOutcomes;
    }

    public int getLecturesTotallyAgree() {
        return lecturesTotallyAgree;
    }

    public void setLecturesTotallyAgree(int lecturesTotallyAgree) {
        this.lecturesTotallyAgree = lecturesTotallyAgree;
    }

    public double getLecturesAgree() {
        return lecturesAgree;
    }

    public void setLecturesAgree(double lecturesAgree) {
        this.lecturesAgree = lecturesAgree;
    }

    public double getLecturesFairly() {
        return lecturesFairly;
    }

    public void setLecturesFairly(double lecturesFairly) {
        this.lecturesFairly = lecturesFairly;
    }

    public double getLecturesDisagree() {
        return lecturesDisagree;
    }

    public void setLecturesDisagree(double lecturesDisagree) {
        this.lecturesDisagree = lecturesDisagree;
    }

    public double getLecturesTotallyDisagree() {
        return lecturesTotallyDisagree;
    }

    public void setLecturesTotallyDisagree(double lecturesTotallyDisagree) {
        this.lecturesTotallyDisagree = lecturesTotallyDisagree;
    }

    public int getLectures() {
        return lectures;
    }

    public void setLectures(int lectures) {
        this.lectures = lectures;
    }

    public int getDoctorTotallyAgree() {
        return doctorTotallyAgree;
    }

    public void setDoctorTotallyAgree(int doctorTotallyAgree) {
        this.doctorTotallyAgree = doctorTotallyAgree;
    }

    public int getDoctorAgree() {
        return doctorAgree;
    }

    public void setDoctorAgree(int doctorAgree) {
        this.doctorAgree = doctorAgree;
    }

    public int getDoctorFairly() {
        return doctorFairly;
    }

    public void setDoctorFairly(int doctorFairly) {
        this.doctorFairly = doctorFairly;
    }

    public int getDoctorDisagree() {
        return doctorDisagree;
    }

    public void setDoctorDisagree(int doctorDisagree) {
        this.doctorDisagree = doctorDisagree;
    }

    public int getDoctorTotallyDisagree() {
        return doctorTotallyDisagree;
    }

    public void setDoctorTotallyDisagree(int doctorTotallyDisagree) {
        this.doctorTotallyDisagree = doctorTotallyDisagree;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public int getDoctorAssistantTotallyAgree() {
        return doctorAssistantTotallyAgree;
    }

    public void setDoctorAssistantTotallyAgree(int doctorAssistantTotallyAgree) {
        this.doctorAssistantTotallyAgree = doctorAssistantTotallyAgree;
    }

    public int getDoctorAssistantAgree() {
        return doctorAssistantAgree;
    }

    public void setDoctorAssistantAgree(int doctorAssistantAgree) {
        this.doctorAssistantAgree = doctorAssistantAgree;
    }

    public int getDoctorAssistantFairly() {
        return doctorAssistantFairly;
    }

    public void setDoctorAssistantFairly(int doctorAssistantFairly) {
        this.doctorAssistantFairly = doctorAssistantFairly;
    }

    public int getDoctorAssistantDisagree() {
        return doctorAssistantDisagree;
    }

    public void setDoctorAssistantDisagree(int doctorAssistantDisagree) {
        this.doctorAssistantDisagree = doctorAssistantDisagree;
    }

    public int getDoctorAssistantTotallyDisagree() {
        return doctorAssistantTotallyDisagree;
    }

    public void setDoctorAssistantTotallyDisagree(int doctorAssistantTotallyDisagree) {
        this.doctorAssistantTotallyDisagree = doctorAssistantTotallyDisagree;
    }

    public int getDoctorAssistant() {
        return doctorAssistant;
    }

    public void setDoctorAssistant(int doctorAssistant) {
        this.doctorAssistant = doctorAssistant;
    }

    public int getEvolutionSystemTotallyAgree() {
        return evolutionSystemTotallyAgree;
    }

    public void setEvolutionSystemTotallyAgree(int evolutionSystemTotallyAgree) {
        this.evolutionSystemTotallyAgree = evolutionSystemTotallyAgree;
    }

    public int getEvolutionSystemAgree() {
        return evolutionSystemAgree;
    }

    public void setEvolutionSystemAgree(int evolutionSystemAgree) {
        this.evolutionSystemAgree = evolutionSystemAgree;
    }

    public int getEvolutionSystemFairly() {
        return evolutionSystemFairly;
    }

    public void setEvolutionSystemFairly(int evolutionSystemFairly) {
        this.evolutionSystemFairly = evolutionSystemFairly;
    }

    public int getEvolutionSystemDisagree() {
        return evolutionSystemDisagree;
    }

    public void setEvolutionSystemDisagree(int evolutionSystemDisagree) {
        this.evolutionSystemDisagree = evolutionSystemDisagree;
    }

    public int getEvolutionSystemTotallyDisagree() {
        return evolutionSystemTotallyDisagree;
    }

    public void setEvolutionSystemTotallyDisagree(int evolutionSystemTotallyDisagree) {
        this.evolutionSystemTotallyDisagree = evolutionSystemTotallyDisagree;
    }

    public int getEvolutionSystem() {
        return evolutionSystem;
    }

    public void setEvolutionSystem(int evolutionSystem) {
        this.evolutionSystem = evolutionSystem;
    }

    public double getFactoriesAndWorkshopsTotallyAgree() {
        return factoriesAndWorkshopsTotallyAgree;
    }

    public void setFactoriesAndWorkshopsTotallyAgree(double factoriesAndWorkshopsTotallyAgree) {
        this.factoriesAndWorkshopsTotallyAgree = factoriesAndWorkshopsTotallyAgree;
    }

    public double getFactoriesAndWorkshopsAgree() {
        return factoriesAndWorkshopsAgree;
    }

    public void setFactoriesAndWorkshopsAgree(double factoriesAndWorkshopsAgree) {
        this.factoriesAndWorkshopsAgree = factoriesAndWorkshopsAgree;
    }

    public double getFactoriesAndWorkshopsFairly() {
        return factoriesAndWorkshopsFairly;
    }

    public void setFactoriesAndWorkshopsFairly(double factoriesAndWorkshopsFairly) {
        this.factoriesAndWorkshopsFairly = factoriesAndWorkshopsFairly;
    }

    public double getFactoriesAndWorkshopsDisagree() {
        return factoriesAndWorkshopsDisagree;
    }

    public void setFactoriesAndWorkshopsDisagree(double factoriesAndWorkshopsDisagree) {
        this.factoriesAndWorkshopsDisagree = factoriesAndWorkshopsDisagree;
    }

    public int getFactoriesAndWorkshopsTotallyDisagree() {
        return factoriesAndWorkshopsTotallyDisagree;
    }

    public void setFactoriesAndWorkshopsTotallyDisagree(int factoriesAndWorkshopsTotallyDisagree) {
        this.factoriesAndWorkshopsTotallyDisagree = factoriesAndWorkshopsTotallyDisagree;
    }

    public int getFactoriesAndWorkshops() {
        return factoriesAndWorkshops;
    }

    public void setFactoriesAndWorkshops(int factoriesAndWorkshops) {
        this.factoriesAndWorkshops = factoriesAndWorkshops;
    }

    public double getStandsAndRoomsTotallyAgree() {
        return standsAndRoomsTotallyAgree;
    }

    public void setStandsAndRoomsTotallyAgree(double standsAndRoomsTotallyAgree) {
        this.standsAndRoomsTotallyAgree = standsAndRoomsTotallyAgree;
    }

    public int getStandsAndRoomsAgree() {
        return standsAndRoomsAgree;
    }

    public void setStandsAndRoomsAgree(int standsAndRoomsAgree) {
        this.standsAndRoomsAgree = standsAndRoomsAgree;
    }

    public int getStandsAndRoomsFairly() {
        return standsAndRoomsFairly;
    }

    public void setStandsAndRoomsFairly(int standsAndRoomsFairly) {
        this.standsAndRoomsFairly = standsAndRoomsFairly;
    }

    public double getStandsAndRoomsDisagree() {
        return standsAndRoomsDisagree;
    }

    public void setStandsAndRoomsDisagree(double standsAndRoomsDisagree) {
        this.standsAndRoomsDisagree = standsAndRoomsDisagree;
    }

    public double getStandsAndRoomsTotallyDisagree() {
        return standsAndRoomsTotallyDisagree;
    }

    public void setStandsAndRoomsTotallyDisagree(double standsAndRoomsTotallyDisagree) {
        this.standsAndRoomsTotallyDisagree = standsAndRoomsTotallyDisagree;
    }

    public int getStandsAndRooms() {
        return standsAndRooms;
    }

    public void setStandsAndRooms(int standsAndRooms) {
        this.standsAndRooms = standsAndRooms;
    }

}
