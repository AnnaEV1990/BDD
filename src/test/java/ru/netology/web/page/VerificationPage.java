package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeFiled = $("[date-test-id=code] input");
    private final SelenideElement verifyButton = $("[date-test-id=action-verify]");

    public VerificationPage() {
        codeFiled.shouldBe(visible);

    }

    public DashboardPage validVerify(String verificationCode) {
        codeFiled.setValue(verificationCode);
        verifyButton.click();
        return new DashboardPage();
    }
}
