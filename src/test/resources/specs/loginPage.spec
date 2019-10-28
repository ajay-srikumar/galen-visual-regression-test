@import common.spec

@objects
    login-box           id  login-page
    login-caption       css #login-page h2

    username-textfield  css input[name='login.username']
    password-textfield  css input[name='login.password']

    login-button        css .button-login
    cancel-button       css .button-cancel


= Login box =
    @on desktop
        login-box:
            centered horizontally inside content 1px
            below menu 20 to 45px

        login-caption:
            height 20 to 35px
            text is "Login"

        username-textfield, password-textfield:
            height 25 to 35 px

        username-textfield:
            below login-caption 5 to 15px
            aligned vertically all password-textfield

        password-textfield:
            below username-textfield 5 to 15px
            aligned vertically left login-button

        login-button, cancel-button:
            height 40 to 50 px

        login-button:
            text is "Login"

        cancel-button:
            text is "Cancel"


