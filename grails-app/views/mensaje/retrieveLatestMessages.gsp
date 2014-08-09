<g:each in="${messages}" var="message">
    <div>
        <span class="nombreUsuario">${message.nombreUsuario}</span> - <span class="msg">${message.mensaje}</span>
    </div>
</g:each>