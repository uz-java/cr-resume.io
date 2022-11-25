<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Template-1</title>
    <style>
        @import url("https://fonts.googleapis.com/css?family=Montserrat:400,500,600,700");

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            list-style: none;
            font-family: "Montserrat", sans-serif;
        }

        body {
            background: #585c68;
            font-size: 14px;
            line-height: 22px;
            color: #555555;
        }

        .bold {
            font-weight: 700;
            font-size: 20px;
            text-transform: uppercase;
        }

        .semi-bold {
            font-weight: 500;
            font-size: 16px;
        }

        .resume {
            width: 800px;
            height: auto;
            display: flex;
            margin: 50px auto;
        }

        .resume .resume_left {
            width: 280px;
            background: #0bb5f4;
        }

        .resume .resume_left .resume_profile {
            width: 100%;
            height: 280px;
        }

        .resume .resume_left .resume_profile img {
            width: 100%;
            height: 300px;
        }

        .resume .resume_left .resume_content {
            padding: 0 25px;
        }

        .resume .title {
            margin-bottom: 20px;
        }

        .resume .resume_left .bold {
            color: #fff;
        }

        .resume .resume_left .regular {
            color: #b1eaff;
        }

        .resume .resume_item {
            padding: 25px 0;
            border-bottom: 2px solid #b1eaff;
        }

        .resume .resume_left .resume_item:last-child,
        .resume .resume_right .resume_item:last-child {
            border-bottom: 0px;
        }

        .resume .resume_left ul li {
            display: flex;
            margin-bottom: 10px;
            align-items: center;
        }

        .resume .resume_left ul li:last-child {
            margin-bottom: 0;
        }

        .resume .resume_left ul li .icon {
            width: 35px;
            height: 35px;
            background: #fff;
            color: #0bb5f4;
            border-radius: 50%;
            margin-right: 15px;
            font-size: 16px;
            position: relative;
        }

        .resume .icon i,
        .resume .resume_right .resume_hobby ul li i {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        .resume .resume_left ul li .data {
            color: #b1eaff;
        }

        .resume .resume_left .resume_skills ul li {
            display: flex;
            margin-bottom: 10px;
            color: #b1eaff;
            justify-content: space-between;
            align-items: center;
        }

        .resume .resume_left .resume_skills ul li .skill_name {
            width: 60%;
        }

        .resume .resume_left .resume_skills ul li .skill_progress {
            width: 60%;
            margin: 0 5px;
            height: 5px;
            background: #009fd9;
            position: relative;
        }

        .resume .resume_left .resume_skills ul li .skill_per {
            width: 15%;
        }

        .resume .resume_left .resume_skills ul li .skill_progress span {
            position: absolute;
            top: 0;
            left: 0;
            height: 100%;
            background: #fff;
        }

        .resume .resume_left .resume_social .semi-bold {
            color: #fff;
            margin-bottom: 3px;
        }

        .resume .resume_right {
            width: 520px;
            background: #fff;
            padding: 25px;
        }

        .resume .resume_right .bold {
            color: #0bb5f4;
        }

        .resume .resume_right .resume_work ul,
        .resume .resume_right .resume_education ul {
            padding-left: 40px;
            overflow: hidden;
        }

        .resume .resume_right ul li {
            position: relative;
        }

        .resume .resume_right ul li .date {
            font-size: 16px;
            font-weight: 500;
            margin-bottom: 15px;
        }

        .resume .resume_right ul li .info {
            margin-bottom: 20px;
        }

        .resume .resume_right ul li:last-child .info {
            margin-bottom: 0;
        }

        .resume .resume_right .resume_work ul li:before,
        .resume .resume_right .resume_education ul li:before {
            content: "";
            position: absolute;
            top: 5px;
            left: -25px;
            width: 6px;
            height: 6px;
            border-radius: 50%;
            border: 2px solid #0bb5f4;
        }

        .resume .resume_right .resume_work ul li:after,
        .resume .resume_right .resume_education ul li:after {
            content: "";
            position: absolute;
            top: 14px;
            left: -21px;
            width: 2px;
            height: 115px;
            background: #0bb5f4;
        }

        .resume .resume_right .resume_hobby ul {
            display: flex;
            justify-content: space-between;
        }

        .resume .resume_right .resume_hobby ul li {
            width: 80px;
            height: 80px;
            border: 2px solid #0bb5f4;
            border-radius: 50%;
            position: relative;
            color: #0bb5f4;
        }

        .resume .resume_right .resume_hobby ul li i {
            font-size: 30px;
        }

        .resume .resume_right .resume_hobby ul li:before {
            content: "";
            position: absolute;
            top: 40px;
            right: -52px;
            width: 50px;
            height: 2px;
            background: #0bb5f4;
        }

        .resume .resume_right .resume_hobby ul li:last-child:before {
            display: none;
        }
    </style>
<body>
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>

<div class="resume">
    <div class="resume_left">
        <div class="resume_profile">
            <img src="${resume.picture.path}" alt="profile_pic">
        </div>
        <div class="resume_content">
            <div class="resume_item resume_info">
                <div class="title">
                    <p class="bold">${resume.header.fullName}</p>
                    <p class="regular">${resume.header.job}</p>
                </div>
                <ul>
                    <li>
                        <div class="data">
                            ${resume.header.address}/${resume.header.country}
                        </div>
                    </li>
                    <li>
                        <div class="data">
                            ${resume.header.phoneNumber}
                        </div>
                    </li>
                    <li>
                        <div class="data">
                            ${resume.header.email}
                        </div>
                    </li>
                    <li>
                        <div class="data">
                            ${resume.header.site}
                        </div>
                    </li>
                </ul>
            </div>
            <div class="resume_item resume_skills">
                <div class="title">
                    <p class="bold">skill's</p>
                </div>
                <ul>
                    <#list resume.skills as skill>
                        <li>
                            <div class="skill_name">
                                ${skill.name}
                            </div>
                        </li>
                    </#list>
                </ul>
            </div>
            <div class="resume_item resume_social">
                <div class="title">
                    <p class="bold">Social</p>
                </div>
                <ul>
                    <#list resume.socialMediaAccounts as social>
                        <li>
                            <div class="data">
                                <p class="semi-bold">${social.name}</p>
                                <p>${social.url}</p>
                            </div>
                        </li>
                    </#list>
                </ul>
            </div>
        </div>
    </div>
    <div class="resume_right">
        <div class="resume_item resume_about">
            <div class="title">
                <p class="bold">About us</p>
            </div>
            <p>${resume.about}</p>
        </div>
        <div class="resume_item resume_work">
            <div class="title">
                <p class="bold">Work Experience</p>
            </div>
            <ul>
                <#list resume.experiences as experience>
                    <li>
                        <div class="date">${experience.date}</div>
                        <div class="info">
                            <p class="semi-bold">${experience.company}</p>
                            <p>${experience.description}</p>
                        </div>
                    </li>
                </#list>
            </ul>
        </div>
        <div class="resume_item resume_education">
            <div class="title">
                <p class="bold">Education</p>
            </div>
            <ul>
                <#list resume.educations as education>
                    <li>
                        <div class="date">${education.date}</div>
                        <div class="info">
                            <p class="semi-bold">${education.name}</p>
                            <p>${education.description}</p>
                        </div>
                    </li>
                </#list>
            </ul>
        </div>

        <div class="resume_item resume_education">
            <div class="title">
                <p class="bold">Language</p>
            </div>
            <ul>
                <#list resume.languages as language>
                    <li>
                        <div class="date">${language.name}</div>
                        <div class="info">
                            <p class="semi-bold">${language.proficiency.description}</p>
                        </div>
                    </li>
                </#list>
            </ul>
        </div>

    </div>
</div>
</body>
</html>