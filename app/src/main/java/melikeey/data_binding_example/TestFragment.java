package melikeey.data_binding_example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import melikeey.data_binding_example.databinding.FragmentTestBinding;

public class TestFragment extends Fragment {

    static TestFragment newInstance() {

        Bundle args = new Bundle();
        TestFragment fragment = new TestFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentTestBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false);

        mBinding.tvFragment.setText(getResources().getText(R.string.hello));

        return mBinding.getRoot();
    }
}
