<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <!-- The settings dialog -->
    <div id="settings" class="settings-content" data-width=450>

        <ul class="tabs center-elements">
            <li><a href="#settings-1"><img src="img/icons/packs/fugue/24x24/user-business.png" alt="" /><span>Account Settings</span></a></li>
            <li><a href="#settings-2"><img src="img/icons/packs/fugue/24x24/balloon.png" alt="" /><span>Notifications</span></a></li>
            <li><a href="#settings-3"><img src="img/icons/packs/fugue/24x24/credit-card.png" alt="" /><span>Invoicing</span></a></li>
        </ul>

        <div class="change_password">
            <form action="#" method="GET" class="validate" id="settings_password">
                <p>
                    <label for="settings-password">New Password:</label> <input type="password" id="settings-password" class="required strongpw small password meter" />
                </p>
            </form>
            <div class="actions">
                <div class="right">
                    <input form="settings_password" type="reset" value="Cancel" class="grey" />
                    <input form="settings_password" type="submit" value="OK" />
                </div>
            </div>
        </div><!-- End of .change_password -->

        <div class="content">

            <div id="settings-1">
                <form action="#" method="GET">
                    <p>
                        <label for="settings-name">Name:</label> <input type="text" id="settings-name" class="medium" />
                    </p>
                    <p>
                        <label for="settings-descr">Descripton:</label> <input type="text" id="settings-descr" class="medium" />
                    </p>
                    <p class="divider"></p>
                    <p>
                        <label for="settings-pw">Password: </label> <input class="grey change_password_button" type="button" id="settings-pw" value="Change Password..." data-lang-changed="Password changed" />
                    </p>
                </for>
            </div><!-- End of #settings-1 -->

            <div id="settings-2">
                Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.
                <form action="#" method="GET">
                    <div class="spacer"></div>
                    <p class="divider"></p>
                    <div class="spacer"></div>
                    <p>
                        <label for="settings-email">Email Address:</label> <input type="text" id="settings-email" class="medium" />
                    </p>
                    <p>
                        <label for="settings-interval">Interval: </label>
                        <select name="settings-interval" id="settings-interval" data-placeholder="Choose an Interval">
                            <option value=""></option>
                            <option value="Never">Never</option>
                            <option value="Daily">Daily</option>
                            <option value="Weekly">Weekly</option>
                            <option value="Monthly">Monthly</option>
                            <option value="Yearly">Yearly</option>
                        </select>
                    </p>
                </form>
            </div><!-- End of #settings-2 -->

            <div id="settings-3">
                <form action="#" method="GET">
                    <p>
                        <label for="settings-card-number">Card number:</label> <input type="text" id="settings-card-number" class="medium" />
                    </p>
                    <p>
                        <label for="settings-cvv">CVV:</label> <input type="text" id="settings-cvv" class="medium" />
                    </p>
                    <p>
                        <label for="settings-expiration">Expiration: </label>
                        <select sname="settings-expiration" id="settings-expiration" data-placeholder="Choose an Expiration">
                            <option value=""></option>
                            <option value="2012">2012</option>
                            <option value="2013">2013</option>
                            <option value="2014">2014</option>
                            <option value="2015">2015</option>
                        </select>
                    </p>
                </form>
            </div><!-- End of #settings-3 -->

        </div><!-- End of .content -->

        <div class="actions">
            <div class="left">
                <button class="grey cancel">Cancel</button>
            </div>
            <div class="right">
                <button class="save">Save</button>
                <button class="hide saving" disabled >Saving...</button>
            </div>
        </div><!-- End of .actions -->

    </div><!-- End of settings dialog -->

    <!-- Add GL Account Dialog -->
     <div id="settings" class="settings-content" data-width=450>
    <div id="dialog_add_client" title="Add GL Account">
        <form action="#" method="POST" class="box validate">
			<div class="row">
                <label for="d2_role">
                    <strong>GL Account Type</strong>
                </label>
                <div>
                    <select name="accountType" id="id_accountType1" class="search" data-placeholder="Choose a accountType" >  
								<option value=-1>-----Select-----</option>
								<c:forEach items="${clientPreConfiguredDataList}" var="accTypeObj">
								    <option value="${accTypeObj.glAccountType}">${accTypeObj.glAccountType}</option>
								</c:forEach>
					</select>
                </div>
            </div>
            <div class="row">
                <label for="d2_username">
                    <strong>GL Account Name</strong>
                </label>
                <div>
                    <input class="required" type="text" name="accountName" id="id_accountName1" />
                </div>
            </div>
            <div class="row">
                <label for="d2_email">
                    <strong>GL Account Number</strong>
                </label>
                <div>
                    <input class="required" type="text" name="accountNumber" id="id_accountNumber1" />
                </div>
            </div>
        </form>
        <div class="actions">
            <div class="left">
                <button class="grey cancel">Cancel</button>
            </div>
            <div class="right">
                <button class="submit" id="id_popup_glscreen">Add GL Account</button>
            </div>
        </div>
    </div><!-- End if #dialog_add_client -->
</div><!-- End of settings dialog -->
    <!--  End of Add Client Example Dialog -->

    <!-- Message Dialog -->
    <div style="display: none;" id="dialog_message" title="Conversation: John Doe">
        <div class="spacer"></div>
        <div class="messages full chat">

            <div class="msg reply">
                <img src="img/icons/packs/iconsweets2/25x25/user-2.png"/>
                <div class="content">
                    <h3><a href="pages_profile.html">John Doe</a> <span>says:</span><small>3 hours ago</small></h3>
                    <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore
                    et dolore magna aliquyam erat, sed diam voluptua.</p>
                </div>
            </div>

            <div class="msg">
                <img src="img/icons/packs/iconsweets2/25x25/user-2.png"/>
                <div class="content">
                    <h3><a href="pages_profile.html">Peter Doe</a> <span>says:</span><small>5 hours ago</small></h3>
                    <p>At vero eos et accusam et justo duo dolores et ea rebum.
                    Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
                </div>
            </div>

        </div><!-- End of .messages -->

        <div class="actions">
            <div class="left">
                <input style="width: 320px;" type="text" name=d3_message id=d3_message placeholder="Type your message..."/>
            </div>
            <div class="right">
                <button>Send</button>
                <button class="grey">Cancel</button>
            </div>
        </div><!-- End of .actions -->

    </div><!-- End of #dialog_message -->

   
    <!-- End of Message Dialog -->

    <!--------------------------------->
    <!-- Now, the page itself begins -->
    <!--------------------------------->



   

<!-- The blue toolbar stripe -->
        <section class="toolbar">
            <div class="user">
                <div class="avatar">
                    <img src="img/layout/content/toolbar/user/avatar.png">
                    <span>200</span>
                </div>
                <span>Administrator</span>
                <ul>
                    <li><a href="javascript:$$.settings();">Settings</a></li>
                    <li><a href="">Profile</a></li>
                    <li class="line"></li>
                    <li><a href="login.html">Logout</a></li>
                </ul>
            </div>
            <ul class="shortcuts">

                <li>
                    <a href="javascript:void(0);"><span class="icon i24_user-business"></span></a>
                    <!-- Possible sizes: small/medium/large -->
                    <div class="small">
                        <h3>Create a User</h3>

                        <!-- Button bar -->
                        <button class="button flat left grey" onclick="$(this).parent().fadeToggle($$.config.fxSpeed).parent().removeClass('active')">Close</button>
                        <button class="button flat right" onclick="$(this).parent().fadeToggle($$.config.fxSpeed).parent().removeClass('active')">Create</button>

                        <div class="content">
                            <form class="full grid">
                                <div class="row no-bg">
                                    <p class="_100 small">
                                        <label for="p1_username">Username</label>
                                        <input type="text" name="p1_username" id="p1_username" />
                                    </p>
                                </div>
                                <div class="row no-bg">
                                    <p class="_50 small">
                                        <label for="p1_firstname">Firstname</label>
                                        <input type="text" name="p1_firstname" id="p1_firstname" />
                                    </p>
                                    <p class="_50 small">
                                        <label for="p1_lastname">Lastname</label>
                                        <input type="text" name="p1_lastname" id="p1_lastname" />
                                    </p>
                                </div>
                            </form>
                        </div>
                    </div><!-- End of popup -->
                </li>

                <li>
                    <a href="javascript:void(0);"><span class="icon i24_inbox-document"></span></a>
                    <!-- Possible sizes: small/medium/large -->
                    <div class="small">
                        <h3>Write a Message</h3>

                        <!-- Button bar -->
                        <button class="button flat left grey" onclick="$(this).parent().fadeToggle($$.config.fxSpeed).parent().removeClass('active')">Close</button>
                        <button class="button flat right" onclick="$(this).parent().fadeToggle($$.config.fxSpeed).parent().removeClass('active')">Send</button>

                        <div class="content">
                            <form class="full grid">
                                <div class="row no-bg">
                                    <p class="_100 small">
                                        <input type="text" name="p2_recipient" id="p2_recipient" placeholder="Recipient" />
                                    </p>
                                    <p class="_100 small">
                                        <input type="text" name="p2_subject" id="p2_subject" placeholder="Subject" />
                                    </p>
                                    <p class="_100 small">
                                        <textarea rows=3 class="full-width" name="p2_message" id="p2_message" placeholder="Message"></textarea>
                                    </p>
                                </div>
                            </form>
                        </div>
                    </div><!-- End of popup -->
                </li>

            </ul><!-- End of .shortcuts -->

            <input type="search" data-source="extras/search.php" placeholder="Search..." autocomplete="off" class="tooltip" title="e.g. Peach" data-gravity=s>
        </section><!-- End of .toolbar-->