package com.example.picker.mvptest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.picker.mvptest.R;
import com.example.picker.mvptest.presenter.UserPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class UserMainActivity extends AppCompatActivity implements IUserView {

    @Bind(R.id.id_edittext_ID)
    EditText idEdittextID;
    @Bind(R.id.id_edittext_FirstName)
    EditText idEdittextFirstName;
    @Bind(R.id.id_edittext_LastName)
    EditText idEdittextLastName;
    @Bind(R.id.id_User_Seve)
    Button idUserSeve;
    @Bind(R.id.id_User_get)
    Button idUserGet;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        ButterKnife.bind(this);

        mUserPresenter=new UserPresenter(this);
        initEvent();
    }

    private void initEvent() {

        idUserSeve.setOnClickListener(myonclick);
        idUserGet.setOnClickListener(myonclick);
    }
    View.OnClickListener myonclick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.id_User_Seve:{
                    mUserPresenter.saveUser(getID(), getFristName(), getLastName());

                    break;
                }
                case R.id.id_User_get:{
                    mUserPresenter.loadUser(getID());

                    break;
                }
            }
        }
    };

    @Override
    public int getID() {
        String mEditetextID=idEdittextID.getText().toString().trim();
        if (mEditetextID.equals("")){
            return 0;
        }
        int id= Integer.parseInt(mEditetextID);
        return id;
    }

    @Override
    public String getFristName() {
        return idEdittextFirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return idEdittextLastName.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {

        idEdittextFirstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {

        idEdittextLastName.setText(lastName);
    }

    @Override
    public void SetLog(String logMessage) {
        Log.e("UserLog",logMessage);
    }
}
