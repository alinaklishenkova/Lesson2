package ru.mirea.klishenkovaai.samostoyatelnaya;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), (DatePicker view, int y, int m, int d) -> {
            Toast.makeText(getActivity(), "Вы выбрали: " + d + "/" + (m + 1) + "/" + y, Toast.LENGTH_SHORT).show();
        }, year, month, day);
    }
}
