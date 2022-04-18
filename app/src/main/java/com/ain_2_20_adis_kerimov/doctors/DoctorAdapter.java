package com.ain_2_20_adis_kerimov.doctors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<DoctorModel> doctors;

    DoctorAdapter(Context context, List<DoctorModel> doctors) {
        this.doctors = doctors;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DoctorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DoctorAdapter.ViewHolder holder, int position) {
        DoctorModel doctor = doctors.get(position);
        holder.docView.setImageResource(doctor.getDocResource());
        holder.nameView.setText(doctor.getName());
        holder.genderView.setText(doctor.getGender());
        holder.ageView.setText(doctor.getAge());
        holder.nationView.setText(doctor.getNationality());
        holder.positionView.setText(doctor.getPosition());
        holder.yearsOfExperienceView.setText(doctor.getYearsOfExperience());
        holder.mainLocationView.setText(doctor.getMainLocation());
        holder.tel_numberView.setText(doctor.getTel_number());
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView docView;
        final TextView nameView, genderView, ageView, yearsOfExperienceView, nationView, positionView, mainLocationView, tel_numberView;
        ViewHolder(View view){
            super(view);
            docView = view.findViewById(R.id.doctor);
            nameView = view.findViewById(R.id.name);
            genderView = view.findViewById(R.id.gender);
            ageView = view.findViewById(R.id.age);
            nationView = view.findViewById(R.id.nation);
            positionView = view.findViewById(R.id.position);
            yearsOfExperienceView = view.findViewById(R.id.yearsOfExperience);
            mainLocationView = view.findViewById(R.id.mainLocation);
            tel_numberView = view.findViewById(R.id.tel_number);
        }
    }
}
