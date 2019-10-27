<div class="container">
<footer class="footer">
		<br><br><br><br><br>
        <p>&copy; 2019 Cibertec, Inc.</p>
      </footer>
</div>

<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrapValidator.js"></script>

<script type="text/javascript">
$(document).ready(function() {
    $('#id_form').bootstrapValidator({
        fields: {
        	txtlogin: {
        		validators: {
        			notEmpty: {
        				message: 'El usuario es un campo obligatorio'
        			}
        		}
        	},
        	txtpass: {
        		validators: {
        			notEmpty: {
        				message: 'El password es un campo obligatorio'
        			}
        		}
        	}
        	/* txtpass: {
        		validators: {
        			notEmpty: {
        				message: 'El password es un campo obligatorio'
        			},
        			regexp: {
        				regexp: /^[a-z0-9]+$/,
        				message: 'Número invalido'
        			},
        			stringLength: {
        				min : 3,
        				max : 16,
        				message: 'Rango de 3 a 16 dígitos'
        			}
        		}
        	} */
        }   
    });

    // Validate the form manually
    $('#validateBtn').click(function() {
        $('#id_form').bootstrapValidator('validate');
    });
});
</script>