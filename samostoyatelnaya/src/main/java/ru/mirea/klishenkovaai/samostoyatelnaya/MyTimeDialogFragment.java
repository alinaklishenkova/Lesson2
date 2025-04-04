package ru.mirea.klishenkovaai.samostoyatelnaya;

import android.app.TimePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), (TimePicker view, int hourOfDay, int minuteOfHour) -> {
            Toast.makeText(getActivity(), "Вы выбрали: " + hourOfDay + ":" + minuteOfHour, Toast.LENGTH_SHORT).show();
        }, hour, minute, true);
    }
}
