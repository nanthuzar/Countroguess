package ait.com.nan.countroguest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import ait.com.nan.countroguest.QuizContract.*;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Myquiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;
        final String SQL_CREATE_QUESTION_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT , " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT , " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT , " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT , " +
                QuestionsTable.COLUMN_ANSWERE_NR + " INTEGER , " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT " +
                " ) ";

                db.execSQL(SQL_CREATE_QUESTION_TABLE);
                fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable(){
        Question q1 = new Question("Easy : What country is the second largest in the world by area? ",
                "Canada","Russia",
                "United States of America",1,Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question("Easy : What is the capital of Jamaica? ",
                "Madraid","Tripoli",
                "Kingston",3,Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question("Easy : Which UK country features a dragon on their flag? ",
                "Wales","England",
                "North Ireland",1,Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question("Easy : " +
                "Which of the following countries has a flag featuring a yellow lion wielding a sword on a dark red background? ",
                "Bhutan","Sri Lanka",
                "Kiribati",2,Question.DIFFICULTY_EASY);
        addQuestion(q4);
        Question q5 = new Question("Easy : What is the capital of Spain? ",
                "Russia","Madrid",
                "United States of America",2,Question.DIFFICULTY_EASY);
        addQuestion(q5);
        Question q6 = new Question("Medium : What European country is not a part of the EU? ",
                "Ireland","Norway",
                "Lithuania",2,Question.DIFFICULTY_MEDIUM);
        addQuestion(q6);
        Question q7 = new Question("Medium : Which of these countries is the smallest by population?",
                "Finland","Slovakia",
                "Norway",3,Question.DIFFICULTY_MEDIUM);
        addQuestion(q7);
        Question q8 = new Question("Medium : Which city is the capital of Switzerland?",
                "Bern","Berlin",
                "London",1,Question.DIFFICULTY_MEDIUM);
        addQuestion(q8);
        Question q9 = new Question("Medium : Which of these is NOT a city in Saudi Arabia?",
                "Bern","Dubai",
                "London",2,Question.DIFFICULTY_MEDIUM);
        addQuestion(q9);
        Question q10 = new Question("Medium : What is the smallest country in South America by area?",
                "Suriname","Uruguay",
                "Brazil",1,Question.DIFFICULTY_MEDIUM);
        addQuestion(q10);
        Question q11 = new Question("Hard : Which of these countries is NOT a part of the Asian continent?",
                "Russia","Singapore",
                "Suriname",3,Question.DIFFICULTY_HARD);
        addQuestion(q11);
        Question q12 = new Question("Hard : What continent is Peru?",
                "Asia","South America",
                "Europe",2,Question.DIFFICULTY_HARD);
        addQuestion(q12);

        Question q13 = new Question("Hard : What is the largest city and commercial capital of Sri Lanka?",
                "Moratuwa","Colombo",
                "Kandy",2,Question.DIFFICULTY_HARD);
        addQuestion(q13);
        Question q14 = new Question("Hard : Which of these is NOT a city in India?",
                "Islamabad","Hyderabad",
                "Ahmedabad",1,Question.DIFFICULTY_HARD);
        addQuestion(q14);
        Question q15 = new Question("Hard : What is the offical name of Maldives?",
                "Union of Maldives","Kingdom of Maldives",
                "Republic of Maldives",3,Question.DIFFICULTY_HARD);
        addQuestion(q15);



    }
    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION ,question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1 ,question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2 ,question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3 ,question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWERE_NR ,question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY ,question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME , null,cv);

    }
    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery(" SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {

                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWERE_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);

            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public ArrayList<Question> getQuestions(String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery(" SELECT * FROM " + QuestionsTable.TABLE_NAME + " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ? " ,selectionArgs) ;

        if (c.moveToFirst()) {
            do {

                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWERE_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);

            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
