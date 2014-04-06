<%@page import="Entity.accountsEntity"%>
<%@include file = "heading.jsp"%>
<div class="container" style="margin-top: 50px;">
    <div class="row">
        <div class="col-md-6">
            <h3>Welcome back, <%=session.getAttribute("name")%>! </h3>
            <h4>Organization Overview</h4>
            <span style="font-size: 20px">Your current needed volunteers: </span>
            <%
                accountsEntity account = new accountsEntity();
                AccountsDAO accountsdao = new AccountsDAO();
                account = accountsdao.getAccounts(session.getAttribute("username").toString(), session.getAttribute("password").toString());
            %>
            <h1 style="margin-top: 10px;"><%=account.getNeededVolunteers()%></h1>
            <span style="font-size: 20px">Name: <%=account.getFirstName()%>&nbsp;<%=account.getLastName()%></span><br />
            <span style="font-size: 20px">Org Name: <%=account.getAreaName()%></span><br />
            <span style="font-size: 20px">Address: <%=account.getAreaAddress()%></span><br />
            <span style="font-size: 20px">Contact Number: <%=account.getOrgContactNum()%></span><br />
            <br />
            <button class="btn btn-danger">UPDATE</button>
        </div>
        <div class="col-md-6">
            <form name = complaintForm action="fileComplaint" class="bs-example form-horizontal">
                <fieldset>
                    <legend>Update Information:</legend>

                    <div class="form-group">
                        <label for="volunteersNeeded" class="col-lg-4 control-label">Volunteers Needed: </label>
                        <div class="col-lg-8">
                            <input class="form-control" type="number" name="volunteersNeeded" id="volunteersNeeded"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="volunteersNeeded" class="col-lg-4 control-label">Name: </label>
                        <div class="col-lg-8">
                            <input class="form-control" type="text" name="Name" id="Name"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="orgName" class="col-lg-4 control-label">Org Name</label>
                        <div class="col-lg-8">
                            <input class="form-control" type="text" name="orgName" id="orgName"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="Address" class="col-lg-4 control-label">Address</label>
                        <div class="col-lg-8">
                            <input class="form-control" type="text" name="Address" id="Address"/>
                        </div>
                    </div><div class="form-group">
                        <label for="ContactNum" class="col-lg-4 control-label">Contact Number</label>
                        <div class="col-lg-8">
                            <input class="form-control" type="text" name="contactNum" id="contactNum"/>
                        </div>
                    </div>
                    <div class="form-group pull-right">
                        <div>
                            <button class="btn btn-primary" type="submit" onClick="return check(this.form);" value="Submit">Submit</button>
                            <button class="btn btn-primary" type="reset" formnovalidate value="Clear">Clear</button>
                        </div>
                    </div>
                </fieldset>
            </form>

        </div>
    </div>
</div>
</body>
</html>
