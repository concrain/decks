
<div id="header">
    <p>
        <a class="header-main"
          %{--href="${resource( dir:'')}">Track  --}%  %{-- empty dir = index --}%
          <a href="${createLink(controller: 'admin', action: 'index')}">Track   %{-- ensures the logo redirects to admin page --}%
        </a>
    </p>
    <p class="header-sub"> When's your next race?</p>

    <div id="loginHeader">
        <g:loginControl />
    </div>
    <g:render template="/layouts/raceSearch" />  %{-- raceSearch template --}%

</div>

