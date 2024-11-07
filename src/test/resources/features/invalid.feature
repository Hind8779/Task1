Feature: Invalid Login Feature

  @fail
  Scenario Outline: User login with invalid or empty credentials and verify the error message
    Given user navigates to the Website
    And clicks on the login button
    When user enters the credentials "<username>" "<password>"
    Then verify the error message is "<message>"

    Examples:
      | username       | password | message                                           |
      |                | 12345678 | يجب ادخال البريد الالكتروني                         |
      | a.saad@ni.iq   |          | يجب ادخال رمز المرور                                |
      | admin          | 12345678 | البريد الإلكتروني او رمز الدخول الذي أدخلته يبدو غير صحيح. |
      | admin          | 123456   | يجب أن يكون رمز المرور 6 أحرف على الأقل              |
