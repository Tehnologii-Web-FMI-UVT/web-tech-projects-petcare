import React from 'react'

function Search2() {
    return (
        <div>
            <div class="s002">
                <form>
                    <fieldset>
                        <legend>Gaseste-ti un nou prieten!</legend>
                    </fieldset>
                    <div class="inner-form">
                        <div class="input-field first-wrap">
                            <div class="icon-wrap">
                                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                    <path d="M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zm0 9.5c-1.38 0-2.5-1.12-2.5-2.5s1.12-2.5 2.5-2.5 2.5 1.12 2.5 2.5-1.12 2.5-2.5 2.5z"></path>
                                </svg>
                            </div>
                            <input id="search" type="text" placeholder="Locatie" />
                        </div>
                        <div class="input-field second-wrap">

                            <input class="datepicker" id="depart" type="text" placeholder="Tip Animal" />
                        </div>


                        <div class="input-field fifth-wrap">
                            <a href="../cautare2"> <button class="btn-search" type="button" >SEARCH</button></a>
                        </div>
                    </div>
                </form>
            </div>
            <script src="js/extention/choices.js"></script>
            <script src="js/extention/flatpickr.js"></script>

        </div>
    )
}

export default Search2