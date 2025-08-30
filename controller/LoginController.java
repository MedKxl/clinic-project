package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;

    @FXML
    private Label errorLabel;

    @FXML
    void handleLogin(ActionEvent event) {
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Please enter both email and password.");
            return;
        }

        // TODO: تحقق من البيانات من ملف users.txt
        boolean success = AuthUtils.checkLogin(email, password);
        if (success) {
            errorLabel.setText("");
            // TODO: الانتقال إلى الصفحة الرئيسية
        } else {
            errorLabel.setText("Invalid email or password.");
        }
    }

    @FXML
    void handleSignup(ActionEvent event) {
        // TODO: الانتقال إلى صفحة التسجيل
    }
}