package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmpInfo;
    ArrayList<EmployeeInfo> alEmployeeInfo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmpInfo = findViewById(R.id.listViewEmployeeInfo);
        alEmployeeInfo = new ArrayList<EmployeeInfo>();

        alEmployeeInfo.add(new EmployeeInfo("John", "Software Technical Leader", "3400.0"));
        alEmployeeInfo.add(new EmployeeInfo("May", "Programmer", "2200.0"));

        adapter = new CustomAdapter(this, R.layout.empinfo, alEmployeeInfo);
        lvEmpInfo.setAdapter(adapter);

    }
}
